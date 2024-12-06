<template>
  <div class="projects-container">
    <h1 class="page-title">Projetos</h1>
    <div class="projects-grid">
      <NuxtLink 
        v-for="project in projects" 
        :key="project.slug"
        :to="`/project/${project.slug}`"
        class="project-card"
      >
        <img :src="project.thumbnail" :alt="project.title" class="project-thumbnail">
        <div class="project-info">
          <h2 class="project-title">{{ project.title }}</h2>
          <p class="project-excerpt">{{ project.excerpt }}</p>
          <div class="project-tags">
            <span v-for="tag in project.tags" :key="tag" class="tag">{{ tag }}</span>
          </div>
        </div>
      </NuxtLink>
    </div>
  </div>
</template>

<script setup>
const projects = ref([
  {
    slug: 'sistema-gestao',
    title: 'Sistema de Gestão Empresarial',
    excerpt: 'Sistema completo para otimização de processos empresariais',
    thumbnail: 'https://images.unsplash.com/photo-1460925895917-afdab827c52f?q=80&w=2015&auto=format',
    tags: ['Vue.js', 'Node.js']
  },
  // Adicione mais projetos aqui
])
</script>

<style scoped>
.projects-container {
  @apply min-h-screen bg-black text-white px-4 py-8;
}

.page-title {
  @apply text-4xl font-bold text-center mb-12 text-red-600;
}

.projects-grid {
  @apply max-w-7xl mx-auto grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-8;
}

.project-card {
  @apply bg-zinc-900 rounded-lg overflow-hidden transition-transform hover:scale-105;
}

.project-thumbnail {
  @apply w-full h-48 object-cover;
}

.project-info {
  @apply p-6;
}

.project-title {
  @apply text-xl font-bold mb-2;
}

.project-excerpt {
  @apply text-gray-300 mb-4;
}

.project-tags {
  @apply flex flex-wrap gap-2;
}

.tag {
  @apply px-3 py-1 bg-red-600 text-sm rounded-full;
}
</style>