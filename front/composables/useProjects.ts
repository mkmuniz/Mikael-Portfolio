import { useRuntimeConfig } from 'nuxt/app'

interface Project {
  id?: string;
  title: string
  slug: string
  excerpt: string
  description: string
  githubUrl?: string
  liveUrl?: string
  technologies: string[]
  images?: string[]
  thumbnail?: string
}

export function useProjects() {
  const config = useRuntimeConfig()
  const baseUrl = config.public.apiBaseUrl

  async function fetchProjects() {
    try {
      const response = await fetch(`${baseUrl}/projects`)
      if (!response.ok) throw new Error(`HTTP error! status: ${response.status}`)
      return await response.json()
    } catch (error) {
      console.error('Erro ao buscar projetos:', error)
      throw error
    }
  }

  async function fetchProjectBySlug(slug: string) {
    try {
      const response = await fetch(`${baseUrl}/projects/${slug}`)
      if (!response.ok) throw new Error(`HTTP error! status: ${response.status}`)
      return await response.json()
    } catch (error) {
      console.error('Erro ao buscar projeto:', error)
      throw error
    }
  }

  async function createProject(project: Project, images: File[]) {
    try {
      console.log('Criando projeto:', project)

      const projectResponse = await fetch(`${baseUrl}/projects`, {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
          'Accept': 'application/json'
        },
        body: JSON.stringify({
          ...project,
          images: [],
          thumbnail: null
        })
      })

      if (!projectResponse.ok) {
        const errorData = await projectResponse.json().catch(() => ({}))
        throw new Error(errorData.message || `HTTP error! status: ${projectResponse.status}`)
      }

      const createdProject = await projectResponse.json()
      console.log('Projeto criado com sucesso:', createdProject)

      if (images?.length > 0 && createdProject.id) {
        console.log('Iniciando upload de imagens para o projeto:', createdProject.id)
        const formData = new FormData()
        
        images.forEach((image) => {
          formData.append('files', image)
        })

        const imageResponse = await fetch(`${baseUrl}/api/images/upload/${createdProject.id}`, {
          method: 'POST',
          body: formData
        })

        if (!imageResponse.ok) {
          console.error('Erro no upload de imagens:', await imageResponse.text())
          throw new Error(`Erro ao fazer upload das imagens: ${imageResponse.status}`)
        }

        const imageUrls = await imageResponse.json()

        const updateResponse = await fetch(`${baseUrl}/projects/${createdProject.id}`, {
          method: 'PUT',
          headers: {
            'Content-Type': 'application/json',
          },
          body: JSON.stringify({
            ...createdProject,
            images: imageUrls,
            thumbnail: imageUrls[0]
          })
        })

        if (!updateResponse.ok) {
          throw new Error(`Erro ao atualizar projeto com as imagens: ${updateResponse.status}`)
        }

        const updatedProject = await updateResponse.json()
        console.log('Projeto atualizado com imagens:', updatedProject)
        return updatedProject
      }

      return createdProject
    } catch (error) {
      console.error('Erro ao criar projeto:', error)
      throw error
    }
  }

  return {
    fetchProjects,
    fetchProjectBySlug,
    createProject
  }
} 