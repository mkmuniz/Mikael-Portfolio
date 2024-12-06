<template>
  <div class="project-container">
    <main class="project-content">
      <ProjectHero 
        :image="project.heroImage"
        :title="project.title"
        :tags="project.tags"
      />

      <section class="project-description">
        <h2 class="section-title">Sobre o Projeto</h2>
        <p class="description-text">{{ project.description }}</p>
      </section>

      <ProjectFeatures
        :features="project.features"
      />

      <ProjectGallery
        :images="project.gallery"
      />
    </main>
  </div>
</template>

<script setup>
const route = useRoute()
const { slug } = route.params

// Simular dados do projeto (posteriormente você pode substituir por uma API real)
const project = ref({
  heroImage: 'https://images.unsplash.com/photo-1460925895917-afdab827c52f?q=80&w=2015&auto=format',
  title: 'Sistema de Gestão Empresarial',
  tags: ['Vue.js', 'Node.js', 'MongoDB', 'Docker'],
  description: 'Um sistema completo de gestão empresarial desenvolvido para otimizar processos internos, gerenciar recursos e aumentar a produtividade. Implementado com as mais modernas tecnologias do mercado, oferecendo uma experiência fluida e responsiva.',
  features: [
    {
      image: 'https://images.unsplash.com/photo-1454165804606-c3d57bc86b40?q=80&w=2070&auto=format',
      title: 'Dashboard Analítico',
      description: 'Visualização em tempo real de métricas importantes do negócio'
    },
    {
      image: 'https://images.unsplash.com/photo-1551288049-bebda4e38f71?q=80&w=2070&auto=format',
      title: 'Design Responsivo',
      description: 'Interface adaptável para todos os dispositivos'
    },
    {
      image: 'https://images.unsplash.com/photo-1486312338219-ce68d2c6f44d?q=80&w=2072&auto=format',
      title: 'Segurança Avançada',
      description: 'Proteção de dados e criptografia de ponta a ponta'
    }
  ],
  gallery: [
    {
      url: 'https://images.unsplash.com/photo-1467232004584-a241de8bcf5d?q=80&w=2069&auto=format',
      alt: 'Interface do usuário'
    },
    {
      url: 'https://images.unsplash.com/photo-1531403009284-440f080d1e12?q=80&w=2070&auto=format',
      alt: 'Painel de controle'
    },
    {
      url: 'https://images.unsplash.com/photo-1460925895917-afdab827c52f?q=80&w=2015&auto=format',
      alt: 'Relatórios'
    }
  ]
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

/* Animações */
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