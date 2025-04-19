<template>
    <div class="min-h-screen bg-black text-white p-8">
        <div class="max-w-3xl mx-auto">
            <div v-if="!isAuthenticated" class="max-w-md mx-auto flex flex-col justify-center">
                <h1 class="text-3xl font-bold mb-8 text-red-600 text-center">Login Administrativo</h1>

                <form @submit.prevent="handleLogin" class="space-y-6">
                    <div>
                        <label class="block mb-2">Usuário</label>
                        <input v-model="loginForm.username" type="text" class="w-full p-2 bg-zinc-900 rounded" required>
                    </div>

                    <div>
                        <label class="block mb-2">Senha</label>
                        <input v-model="loginForm.password" type="password" class="w-full p-2 bg-zinc-900 rounded"
                            required>
                    </div>

                    <div v-if="loginError" class="text-red-500 text-sm">
                        {{ loginError }}
                    </div>

                    <button type="submit"
                        class="w-full px-6 py-2 bg-red-600 rounded hover:bg-red-700 transition-colors">
                        Entrar
                    </button>
                </form>
            </div>
            <div v-else>
                <h1 class="text-3xl font-bold mb-8 text-red-600 text-center">Cadastrar Novo Projeto</h1>

                <form @submit.prevent="handleSubmit" class="space-y-6">
                    <div class="space-y-4">
                        <div>
                            <label class="block mb-2">Título</label>
                            <input v-model="project.title" type="text" class="w-full p-2 bg-zinc-900 rounded" required>
                        </div>

                        <div>
                            <label class="block mb-2">Slug</label>
                            <input v-model="project.slug" type="text" class="w-full p-2 bg-zinc-900 rounded" required>
                        </div>

                        <div>
                            <label class="block mb-2">Descrição Curta</label>
                            <input v-model="project.excerpt" type="text" class="w-full p-2 bg-zinc-900 rounded"
                                required>
                        </div>

                        <div>
                            <label class="block mb-2">Descrição Completa</label>
                            <textarea v-model="project.description" class="w-full p-2 bg-zinc-900 rounded h-32"
                                required></textarea>
                        </div>

                        <div>
                            <label class="block mb-2">URL do GitHub</label>
                            <input v-model="project.githubUrl" type="url" class="w-full p-2 bg-zinc-900 rounded">
                        </div>

                        <div>
                            <label class="block mb-2">URL do Projeto</label>
                            <input v-model="project.liveUrl" type="url" class="w-full p-2 bg-zinc-900 rounded">
                        </div>

                        <div>
                            <label class="block mb-2">Tecnologias (separadas por vírgula)</label>
                            <input v-model="technologiesInput" type="text" class="w-full p-2 bg-zinc-900 rounded"
                                placeholder="React, Node.js, MongoDB">
                        </div>
                    </div>
                    <div>
                        <label class="block mb-2">Imagens do Projeto</label>
                        <p class="text-sm text-gray-400 mb-2">A primeira imagem será usada como thumbnail</p>
                        <input 
                            type="file" 
                            @change="handleImageSelect" 
                            multiple 
                            accept="image/*"
                            class="w-full p-2 bg-zinc-900 rounded"
                        >
                        <div v-if="imagePreview.length" class="grid grid-cols-3 gap-4 mt-4">
                            <div 
                                v-for="(preview, index) in imagePreview" 
                                :key="index" 
                                class="relative"
                            >
                                <NuxtImg 
                                    :src="preview.url" 
                                    class="w-full h-32 object-cover rounded"
                                    :class="{ 'border-2 border-red-600': preview.isThumbnail }"
                                />
                                <span 
                                    v-if="preview.isThumbnail" 
                                    class="absolute top-2 left-2 bg-red-600 text-white text-xs px-2 py-1 rounded"
                                >
                                    Thumbnail
                                </span>
                                <button 
                                    @click="removeImage(index)"
                                    class="absolute top-2 right-2 bg-red-600 p-1 rounded-full"
                                >
                                    X
                                </button>
                            </div>
                        </div>
                    </div>

                    <div class="flex gap-4">
                        <button type="submit" class="px-6 py-2 bg-red-600 rounded hover:bg-red-700 transition-colors"
                            :disabled="loading">
                            {{ loading ? 'Salvando...' : 'Salvar Projeto' }}
                        </button>
                        <NuxtLink to="/project"
                            class="px-6 py-2 bg-zinc-700 rounded hover:bg-zinc-600 transition-colors">
                            Cancelar
                        </NuxtLink>
                    </div>
                </form>
            </div>
        </div>
    </div>
</template>

<script setup>
import { ref, onMounted } from 'vue'

const { createProject } = useProjects()
const config = useRuntimeConfig()

const ADMIN_CREDENTIALS = {
    username: config.public.adminUsername,
    password: config.public.adminPassword
}

const isAuthenticated = ref(false)
const loginForm = ref({
    username: '',
    password: ''
})
const loginError = ref('')
const project = ref({
    title: '',
    slug: '',
    excerpt: '',
    description: '',
    githubUrl: '',
    liveUrl: '',
    technologies: [],
    thumbnail: null
})

const technologiesInput = ref('')
const selectedImages = ref([])
const imagePreview = ref([])
const loading = ref(false)

onMounted(() => {
    const auth = localStorage.getItem('projectAdmin')
    if (auth === 'true') {
        isAuthenticated.value = true
    }
})

const handleLogin = () => {
    if (loginForm.value.username === ADMIN_CREDENTIALS.username &&
        loginForm.value.password === ADMIN_CREDENTIALS.password) {
        isAuthenticated.value = true
        localStorage.setItem('projectAdmin', 'true')
        loginError.value = ''
    } else {
        loginError.value = 'Usuário ou senha incorretos'
    }
}

const handleImageSelect = (event) => {
    const files = Array.from(event.target.files)
    if (files.length === 0) return

    if (!project.value.thumbnail) {
        project.value.thumbnail = files[0]
    }

    selectedImages.value = [...selectedImages.value, ...files]
    
    files.forEach(file => {
        const reader = new FileReader()
        reader.onload = (e) => {
            imagePreview.value.push({
                url: e.target.result,
                isThumbnail: selectedImages.value.length === 1
            })
        }
        reader.readAsDataURL(file)
    })
}

const removeImage = (index) => {
    if (index === 0 && selectedImages.value[0] === project.value.thumbnail) {
        project.value.thumbnail = selectedImages.value[1] || null
    }
    
    selectedImages.value.splice(index, 1)
    imagePreview.value.splice(index, 1)
}

const handleSubmit = async () => {
    if (!isAuthenticated.value) {
        alert('Você precisa estar autenticado para cadastrar projetos')
        return
    }

    if (!project.value.thumbnail) {
        alert('É necessário adicionar pelo menos uma imagem como thumbnail')
        return
    }

    try {
        loading.value = true

        project.value.technologies = technologiesInput.value
            .split(',')
            .map(tech => tech.trim())
            .filter(tech => tech)

        const result = await createProject(project.value, selectedImages.value)
        console.log('Projeto criado com sucesso:', result)
        
        await navigateTo('/project')
    } catch (error) {
        console.error('Erro ao salvar projeto:', error)
        alert(`Erro ao salvar o projeto: ${error.message || 'Erro desconhecido'}`)
    } finally {
        loading.value = false
    }
}
</script>