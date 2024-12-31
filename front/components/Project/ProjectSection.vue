<template>
  <section id="projects" class="w-full min-h-screen bg-black py-20 px-4">
    <div class="max-w-7xl mx-auto">
      <h2 class="text-4xl font-bold text-white inline-block relative">
        {{ $t('projects.title') }}
        <span class="absolute left-0 bottom-[-8px] w-full h-1 bg-red-600"></span>
      </h2>
      <p class="text-xl text-center mb-12 text-gray-300">
        {{ $t('projects.subtitle') }}
      </p>

      <div v-if="loading" class="text-center text-white">
        Carregando projetos...
      </div>

      <div v-else-if="error" class="text-center text-red-500">
        {{ error }}
      </div>

      <div v-else class="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-8">
        <NuxtLink v-for="project in projects" :key="project.slug" :to="`/project/${project.slug}`"
          class="group bg-zinc-900 rounded-lg overflow-hidden transform transition-all duration-300 hover:scale-105">
          <div class="relative overflow-hidden">
            <img :src="`${project.images[0]}`" :alt="project.title" class="w-full h-48 object-cover">
            <div
              class="absolute inset-0 bg-black/70 flex items-center justify-center opacity-0 transition-opacity duration-300 group-hover:opacity-100">
              <span
                class="px-6 py-3 bg-red-600 text-white rounded-full font-medium transform translate-y-4 transition-transform duration-300 group-hover:translate-y-0">
                {{ $t('projects.viewProject') }}
              </span>
            </div>
          </div>

          <div class="p-6">
            <h3 class="text-xl font-bold mb-2 text-white">
              {{ project.title }}
            </h3>
            <p class="text-gray-300 mb-4 text-sm">
              {{ project.excerpt }}
            </p>
            <div class="flex flex-wrap gap-2">
              <span v-for="technology in project.technologies" :key="technology"
                class="px-3 py-1 bg-red-600 text-sm rounded-full text-white">
                {{ technology }}
              </span>
            </div>
          </div>
        </NuxtLink>
      </div>
    </div>
  </section>
</template>

<script setup>
import { ref, onMounted } from 'vue'
import { useRuntimeConfig } from '#app'

const config = useRuntimeConfig()
const projects = ref([])
const loading = ref(true)
const error = ref(null)

onMounted(async () => {
  try {
    loading.value = true
    const response = await $fetch(`${config.public.apiBaseUrl}/projects`, {
      headers: {
        'Accept': 'application/json'
      }
    })
    projects.value = response
    console.log('Projetos carregados:', projects.value)
  } catch (e) {
    error.value = 'Erro ao carregar os projetos. Por favor, tente novamente mais tarde.'
    console.error('Erro detalhado:', e)
  } finally {
    loading.value = false
  }
})
</script>