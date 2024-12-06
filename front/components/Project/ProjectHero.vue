<template>
  <section class="project-hero">
    <div class="project-hero__image">
      <img 
        :src="image"
        :alt="title" 
        class="w-full h-full object-cover"
      >
    </div>
    
    <div class="project-hero__info">
      <h1 class="project-title">{{ title }}</h1>
      <div class="project-tags">
        <span v-for="tag in tags" :key="tag" class="tag">
          {{ tag }}
        </span>
      </div>
    </div>
  </section>
</template>

<script setup>
defineProps({
  image: {
    type: String,
    required: true
  },
  title: {
    type: String,
    required: true
  },
  tags: {
    type: Array,
    default: () => []
  }
})
</script>

<style scoped>
.project-hero {
  @apply mb-16;
}

.project-hero__image {
  @apply w-full h-[60vh] relative rounded-lg overflow-hidden mb-8;
}

.project-title {
  @apply text-4xl md:text-6xl font-bold mb-4;
}

.project-tags {
  @apply flex flex-wrap gap-2;
}

.tag {
  @apply px-4 py-2 bg-red-600 rounded-full text-sm font-medium;
}
</style> 