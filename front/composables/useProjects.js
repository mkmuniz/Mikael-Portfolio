export const useProjects = () => {
  const projects = ref([
    {
      slug: 'freedom-language-network',
      tags: ['Next.js', 'TypeScript', 'Google Cloud Platform', 'Tailwind CSS'],
      link: 'https://fln-ashy.vercel.app/'
    },
    {
      slug: 'biflux',
      tags: ['Next.js', 'Node.js', 'Prisma', 'AWS', 'PostgreSQL', 'Docker'],
      link: 'https://biflux.vercel.app/'
    },
    // ... outros projetos
  ])

  const getProject = (slug) => {
    return projects.value.find(p => p.slug === slug)
  }

  return {
    projects,
    getProject
  }
} 