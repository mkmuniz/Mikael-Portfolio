<template>
  <section id="projects" class="w-full min-h-screen bg-black py-20 px-4">
    <div class="max-w-7xl mx-auto">
      <h2 class="text-4xl md:text-5xl font-bold text-center mb-4 text-red-600">
        {{ $t('projects.title') }}
      </h2>
      <p class="text-xl text-center mb-12 text-gray-300">
        {{ $t('projects.subtitle') }}
      </p>
      
      <div class="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-8">
        <NuxtLink 
          v-for="project in projects" 
          :key="project.slug"
          :to="`/`"
          class="group bg-zinc-900 rounded-lg overflow-hidden transform transition-all duration-300 hover:scale-105"
        >
          <div class="relative overflow-hidden">
            <img 
              :src="project.thumbnail" 
              :alt="project.title" 
              class="w-full h-48 object-cover"
            >
            <!-- <div class="absolute inset-0 bg-black/70 flex items-center justify-center opacity-0 transition-opacity duration-300 group-hover:opacity-100">
              <span class="px-6 py-3 bg-red-600 text-white rounded-full font-medium transform translate-y-4 transition-transform duration-300 group-hover:translate-y-0">
                {{ $t('projects.viewProject') }}
              </span>
            </div> -->
          </div>
          
          <div class="p-6">
            <h3 class="text-xl font-bold mb-2 text-white">
              {{ $t(`projects.items.${project.slug}.title`) }}
            </h3>
            <p class="text-gray-300 mb-4 text-sm">
              {{ $t(`projects.items.${project.slug}.excerpt`) }}
            </p>
            <div class="flex flex-wrap gap-2">
              <span 
                v-for="tag in project.tags" 
                :key="tag" 
                class="px-3 py-1 bg-red-600 text-sm rounded-full text-white"
              >
                {{ tag }}
              </span>
            </div>
          </div>
        </NuxtLink>
      </div>
    </div>
  </section>
</template>

<script setup>
const projects = ref([
  {
    slug: 'freedom-language-network',
    thumbnail: '/images/projects/fln.png',
    tags: ['Next.js', 'TypeScript', 'Google Cloud Platform', 'Tailwind CSS'],
    link: 'https://fln-ashy.vercel.app/'
  },
  {
    slug: 'biflux',
    thumbnail: '/images/projects/biflux.png',
    tags: ['Next.js', 'Node.js', 'Prisma', 'AWS', 'PostgreSQL', 'Docker'],
    link: 'https://biflux.vercel.app/'
  },
  {
    slug: 'portfolio',
    thumbnail: '/images/projects/mkmuniz.png',
    tags: ['Nuxt.js', 'TypeScript','Java', 'Tailwind CSS'],
    link: 'https://www.mkmuniz.dev/'
  },
  {
    slug: 'cidadao-zoiudo',
    thumbnail: '/images/projects/cidadao-zoiudo.png',
    tags: ['Next.js', 'Node.js', 'Playwright', 'Docker', 'Tailwind CSS', 'AWS', 'PostgreSQL'],
    link: 'https://cidadao-zoiudo.vercel.app'
  },
  {
    slug: 'ujl-portal',
    thumbnail: '/images/projects/ujl.png',
    tags: ['Next.js', 'Tailwind CSS', 'Node.js', 'Django', 'PostgreSQL'],
    link: 'https://www.ujliberdade.org.br'
  },
  {
    slug: 'oriente',
    thumbnail: '/images/projects/mack.png',
    tags: ['React', 'Node.js', 'Docker', 'MongoDB'],
    link: 'https://mackleaps.mackenzie.br/oriente/'
  }
])
</script> 