<template>
  <div v-if="loading" class="project-container">
    <div class="project-content">
      <p class="text-white text-center">Carregando projeto...</p>
    </div>
  </div>

  <div v-else-if="error" class="project-container">
    <div class="project-content">
      <p class="text-red-500 text-center">{{ error }}</p>
    </div>
  </div>

  <div v-else-if="project" class="project-container">
    <main class="project-content">
      <ProjectHero 
        :image="`${config.public.apiBaseUrl}/images/${project.images[0]}`"
        :title="project.title"
        :technologies="project.technologies"
      />

      <section class="project-description">
        <h2 class="section-title">Sobre o Projeto</h2>
        <p class="description-text">{{ project.description }}</p>
      </section>

      <ProjectFeatures
        v-if="project.features"
        :features="project.features"
      />

      <ProjectGallery
        v-if="project.gallery"
        :images="project.gallery"
      />
    </main>
  </div>
</template>

<script setup>
const route = useRoute()
const project = ref(null)
const loading = ref(true)
const error = ref(null)
const config = useRuntimeConfig()

onMounted(async () => {
  try {
    loading.value = true
    const response = await $fetch(`http://localhost:8080/api/projects/${route.params.slug}`, {
      headers: {
        'Accept': 'application/json'
      }
    })
    project.value = response
    console.log('Projeto carregado:', project.value)
  } catch (e) {
    error.value = 'Erro ao carregar o projeto. Por favor, tente novamente mais tarde.'
    console.error('Erro detalhado:', e)
  } finally {
    loading.value = false
  }
})
</script>

<style scoped>
.project-container {
  @apply min-h-screen bg-black text-white;
}

.project-content {
  @apply max-w-7xl mx-auto px-4 py-8;
}

.section-title {
  @apply text-2xl md:text-3xl font-bold mb-6 text-red-600;
}

.description-text {
  @apply text-lg leading-relaxed text-gray-300;
}

.project-content > * {
  @apply opacity-0 animate-fadeIn;
}

@keyframes fadeIn {
  from {
    opacity: 0;
    transform: translateY(20px);
  }
  to {
    opacity: 1;
    transform: translateY(0);
  }
}

.animate-fadeIn {
  animation: fadeIn 0.6s ease-out forwards;
}
</style> 