<template>
    <div
      ref="parallaxContainer"
      class="w-full lg:h-screen text-white font-hubot select-none 3xl:container 3xl:mx-auto bg-black overflow-hidden transition-all duration-300 ease-out"
      :style="{
        backgroundImage: `url('${backgroundImage}')`,
        backgroundSize: 'cover',
        backgroundAttachment: 'fixed',
        backgroundPosition: 'center top',
        backgroundRepeat: 'no-repeat'
      }"
    >
      <div class="lg:grid lg:grid-cols-2 flex flex-col items-center lg:h-screen">
        <div
          class="h-screen flex justify-center items-center sm:text-left text-center"
          :style="parallaxTransform(1.5)"
        >
          <span>
            <div
              class="w-full flex items-center justify-center lg:hidden visible mb-4"
              :style="parallaxTransform(1.2)"
            >
              <NuxtImg src="/images/header-background-mikael.png" class="w-[50%] max-w-[500px]" alt="Mkmuniz Background Header" />
            </div>
            <div class="p-3 tablet:text-center" :style="parallaxTransform(1)">
              <p class="text-3xl text-standard">{{ $t("header.welcome") }}</p>
              <h1 class="text-5xl">Mikael Muniz Ribeiro</h1>
              <p class="text-4xl mt-2">{{ $t("header.role") }}</p>
            </div>
            <div
              class="flex space-x-3 p-3 lg:justify-start justify-center"
              :style="parallaxTransform(0.8)"
            >
              <NuxtLink 
                to="https://github.com/mkmuniz" 
                target="_blank" 
                class="text-4xl transition-all hover:text-standard" 
                aria-label="GitHub de Mikael Muniz">
                <Icon name="uil:github" />
              </NuxtLink>
              <NuxtLink 
                to="https://www.linkedin.com/in/mikael-muniz-ribeiro/" 
                target="_blank" 
                class="text-4xl transition-all hover:text-standard" 
                aria-label="LinkedIn de Mikael Muniz">
                <Icon name="uil:linkedin" />
              </NuxtLink>
              <NuxtLink 
                to="https://linktr.ee/mkmuniz" 
                target="_blank" 
                class="text-4xl transition-all hover:text-standard" 
                aria-label="Linktree de Mikael Muniz">
                <Icon name="icon-park-outline:link-three" />
              </NuxtLink>
            </div>
          </span>
        </div>
        <div class="w-full lg:flex items-center justify-center lg:visible hidden" :style="parallaxTransform(1.2)">
          <NuxtImg src="/images/header-background-mikael.png" class="w-2/4 max-w-[500px]" alt="Mkmuniz Person Logo" />
        </div>
      </div>
    </div>
  </template>
  
  <script>
  export default {
    name: "HeaderHome",
    data() {
      return {
        backgroundImage: '/images/header-background.png',
        scrollY: 0
      }
    },
    mounted() {
      window.addEventListener('scroll', this.handleScroll)
    },
    beforeDestroy() {
      window.removeEventListener('scroll', this.handleScroll)
    },
    methods: {
      handleScroll() {
        this.scrollY = window.scrollY
      },
      parallaxTransform(multiplier = 1) {
        const offset = Math.max(0, this.scrollY * multiplier * 0.2)
        return {
          transform: `translateY(${offset}px)`,
          transition: 'transform 0.1s ease-out'
        }
      }
    }
  }
  </script>  