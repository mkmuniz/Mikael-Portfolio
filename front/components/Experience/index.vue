<script setup>
import { onMounted } from 'vue'
import {
    initAccordions,
    initCarousels,
    initCollapses,
    initDials,
    initDismisses,
    initDrawers,
    initDropdowns,
    initModals,
    initPopovers,
    initTabs,
    initTooltips
} from 'flowbite'

onMounted(() => {
    initAccordions();
    initCarousels();
    initCollapses();
    initDials();
    initDismisses();
    initDrawers();
    initDropdowns();
    initModals();
    initPopovers();
    initTabs();
    initTooltips();
})

const experiences = [
    {
        title: "experience.mackleaps_intern.title",
        time: "experience.mackleaps_intern.time",
        description: "experience.mackleaps_intern.description",
        stacks: "experience.mackleaps_intern.stacks",
        image: "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3d/Mackenzie_M.svg/1200px-Mackenzie_M.svg.png",
        link: "https://mackleaps.mackenzie.br"
    },
    {
        title: "experience.mackleaps_fullstack.title",
        time: "experience.mackleaps_fullstack.time",
        description: "experience.mackleaps_fullstack.description",
        stacks: "experience.mackleaps_fullstack.stacks",
        image: "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3d/Mackenzie_M.svg/1200px-Mackenzie_M.svg.png",
        link: "https://mackleaps.mackenzie.br"
    },
    {
        title: "experience.agentesdev_fullstack.title",
        time: "experience.agentesdev_fullstack.time",
        description: "experience.agentesdev_fullstack.description",
        stacks: "experience.agentesdev_fullstack.stacks",
        image: "/images/agentes-dev.png",
        link: "https://agentesdev.com.br",
        imageClass: "rounded-full"
    },
    {
        title: "experience.sossego_back.title",
        time: "experience.sossego_back.time",
        description: "experience.sossego_back.description",
        stacks: "experience.sossego_back.stacks",
        image: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR85LSmkiQY8CIEhzNduCTJHALMITmE762Kw4fBjFavy61W7zseUE-dDlRONPEM04wrcp8&usqp=CAU",
        link: "https://www.sossego.com.br",
        imageClass: "rounded-full"
    },
    {
        title: "experience.bolha_fullstack.title",
        time: "experience.bolha_fullstack.time",
        description: "experience.bolha_fullstack.description",
        stacks: "experience.bolha_fullstack.stacks",
        image: "https://99prod.s3.amazonaws.com/uploads/image/file/522697/bolha-logo1024x1024-azul.png",
        link: "https://www.bolha.com.br"
    },
    {
        title: "experience.ricam_engineer.title",
        time: "experience.ricam_engineer.time",
        description: "experience.ricam_engineer.description",
        stacks: "experience.ricam_engineer.stacks",
        image: "https://media.licdn.com/dms/image/v2/C4E0BAQHsyagUt6OoNQ/company-logo_200_200/company-logo_200_200/0/1631321610275?e=1746057600&v=beta&t=pwiT1ZFf6ebmHOXZ107m5a_jWhn9weJONJ3fvjo-NNs",
        link: "https://ricamconsultoria.com.br/"
    }
]
</script>

<template>
    <div id="experience" class="relative w-full font-hubot text-white sm:text-left text-center 3xl:container 3xl:mx-auto mobile:p-6 p-3 bg-black" data-carousel="slide" data-carousel-interval="8000">
        <div class="relative h-screen overflow-hidden rounded-2xl backdrop-blur-sm bg-black/20">
            <div v-for="(experience, index) in experiences" :key="index" class="hidden duration-1000 h-screen ease-in-out select-none transform transition-all" data-carousel-item>
                <ExperienceCard 
                    :title="$t(experience.title)"
                    :time="$t(experience.time)"
                    :description="$t(experience.description)"
                    :stacks="$t(experience.stacks)"
                    :image="experience.image"
                    :link="experience.link"
                    :imageClass="experience.imageClass"
                />
            </div>
        </div>
        
        <div class="absolute z-30 flex -translate-x-1/2 bottom-8 left-1/2 space-x-4 rtl:space-x-reverse">
            <button v-for="(_, index) in experiences" 
                    :key="index"
                    type="button" 
                    class="w-2.5 h-2.5 rounded-full bg-white/50 hover:bg-white transition-colors" 
                    :aria-current="index === 0" 
                    :aria-label="`Slide ${index + 1}`"
                    :data-carousel-slide-to="index">
            </button>
        </div>
        
        <button type="button"
            class="absolute top-0 start-0 z-30 flex items-center justify-center h-full px-4 cursor-pointer group focus:outline-none"
            data-carousel-prev>
            <span class="inline-flex items-center justify-center w-12 h-12 rounded-full bg-white/30 backdrop-blur-sm group-hover:bg-white/50 group-focus:ring-4 group-focus:ring-white/70 group-focus:outline-none transition-all duration-300">
                <svg class="w-5 h-5 text-white rtl:rotate-180" aria-hidden="true" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 6 10">
                    <path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M5 1 1 5l4 4" />
                </svg>
                <span class="sr-only">Previous</span>
            </span>
        </button>
        
        <button type="button"
            class="absolute top-0 end-0 z-30 flex items-center justify-center h-full px-4 cursor-pointer group focus:outline-none"
            data-carousel-next>
            <span class="inline-flex items-center justify-center w-12 h-12 rounded-full bg-white/30 backdrop-blur-sm group-hover:bg-white/50 group-focus:ring-4 group-focus:ring-white/70 group-focus:outline-none transition-all duration-300">
                <svg class="w-5 h-5 text-white rtl:rotate-180" aria-hidden="true" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 6 10">
                    <path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="m1 9 4-4-4-4" />
                </svg>
                <span class="sr-only">Next</span>
            </span>
        </button>
    </div>
</template>