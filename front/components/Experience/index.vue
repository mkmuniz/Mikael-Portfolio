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

// initialize components based on data attribute selectors
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
</script>

<template>
    <div id="default-carousel" class="relative w-full font-hubot text-white" data-carousel="slide">
        <!-- Carousel wrapper -->
        <div class="relative h-screen overflow-hidden">
            <!-- Item 1 -->
            <div class="hidden duration-700 ease-in-out" data-carousel-item>
                <div class="grid grid-cols-2 h-screen">
                    <div class="w-full h-full flex flex-col justify-center">
                        <div class="m-6">
                            <span class="text-4xl">
                                MACKLEAPS - Full Stack Intern
                            </span>
                            <p class="text-xl">06/2020 - 06/2022</p>
                            <span class="mt-2">
                                Technical leadership, development
                                and support in projects
                                Participated in Oriente platform
                                development.
                                Developed MackLeaps website.
                                Javascript, Typescript, React,
                                NodeJS, Go, Java, Docker, APIs REST,
                                SQL, GitHub, SOLID, GitLab.
                            </span>
                        </div>
                    </div>
                    <div class="w-full flex items-center justify-center">
                        <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/3/3d/Mackenzie_M.svg/1200px-Mackenzie_M.svg.png"
                            class="w-2/5" />
                    </div>
                </div>
            </div>
            <!-- Item 2 -->
            <div class="hidden duration-700 ease-in-out" data-carousel-item>
                <div class="grid grid-cols-2 h-screen">
                    <div class="w-full h-full flex flex-col justify-center">
                        <div class="m-6">
                            <span class="text-4xl">
                                MACKLEAPS - Full Stack Developer
                            </span>
                            <p class="text-xl">08/2022 - 01/2023</p>
                            <span class="mt-2">
                                Responsible by guide & teach new
                                interns, leadership, tasks
                                organizations, project
                                management & development in
                                Back-End and front-End
                                Participated in Associação
                                Comercial de São Paulo website
                                development
                                TypeScript, React, NodeJS, Python,
                                NestJS, C#, Docker, Ruby,
                                Postgresql, MongoDB, MySQL.
                            </span>
                        </div>
                    </div>
                    <div class="w-full flex items-center justify-center">
                        <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/3/3d/Mackenzie_M.svg/1200px-Mackenzie_M.svg.png"
                            class="w-2/5" />
                    </div>
                </div>
            </div>
            <!-- Item 3 -->
            <div class="hidden duration-700 ease-in-out" data-carousel-item>
                <div class="grid grid-cols-2 h-screen">
                    <div class="w-full h-full flex flex-col justify-center">
                        <div class="m-6">
                            <span class="text-4xl">
                                AgentesDev - Full Stack Developer
                            </span>
                            <p class="text-xl">06/2022 - Current</p>
                            <span class="mt-2">
                                Participated in UJL Portal
                                Web scraper development.
                                TypeScript, JavaScript, Express
                                NextJS, HTML5, CSS, Sass Tailwind
                                & Python
                            </span>
                        </div>
                    </div>
                    <div class="w-full flex items-center justify-center">
                        <img src="https://www.agentesdev.com.br/_next/image?url=%2Fimages%2Flogo.png&w=256&q=75" />
                    </div>
                </div>
            </div>
            <!-- Item 4 -->
            <div class="hidden duration-700 ease-in-out" data-carousel-item>
                <div class="grid grid-cols-2 h-screen">
                    <div class="w-full h-full flex flex-col justify-center">
                        <div class="m-6">
                            <span class="text-4xl">
                                Sossego - Back-End Developer
                            </span>
                            <p class="text-xl">01/2023 - 08/2023</p>
                            <span class="mt-2">
                                Encharged to create &
                                maintenance robots for webscraping using Playwright, NodeJS,
                                NestJS, Python, Docker &
                                development in API's.
                            </span>
                        </div>
                    </div>
                    <div class="w-full flex items-center justify-center">
                        <img
                            src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR85LSmkiQY8CIEhzNduCTJHALMITmE762Kw4fBjFavy61W7zseUE-dDlRONPEM04wrcp8&usqp=CAU" />
                    </div>
                </div>
            </div>
        </div>
        <!-- Slider indicators -->
        <div class="absolute z-30 flex -translate-x-1/2 bottom-5 left-1/2 space-x-3 rtl:space-x-reverse">
            <button type="button" class="w-3 h-3 rounded-full" aria-current="true" aria-label="Slide 1"
                data-carousel-slide-to="0"></button>
            <button type="button" class="w-3 h-3 rounded-full" aria-current="false" aria-label="Slide 2"
                data-carousel-slide-to="1"></button>
            <button type="button" class="w-3 h-3 rounded-full" aria-current="false" aria-label="Slide 3"
                data-carousel-slide-to="2"></button>
            <button type="button" class="w-3 h-3 rounded-full" aria-current="false" aria-label="Slide 4"
                data-carousel-slide-to="3"></button>
        </div>
        <!-- Slider controls -->
        <button type="button"
            class="absolute top-0 start-0 z-30 flex items-center justify-center h-full px-4 cursor-pointer group focus:outline-none"
            data-carousel-prev>
            <span
                class="inline-flex items-center justify-center w-10 h-10 rounded-full bg-white/30 dark:bg-gray-800/30 group-hover:bg-white/50 dark:group-hover:bg-gray-800/60 group-focus:ring-4 group-focus:ring-white dark:group-focus:ring-gray-800/70 group-focus:outline-none">
                <svg class="w-4 h-4 text-white dark:text-gray-800 rtl:rotate-180" aria-hidden="true"
                    xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 6 10">
                    <path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                        d="M5 1 1 5l4 4" />
                </svg>
                <span class="sr-only">Previous</span>
            </span>
        </button>
        <button type="button"
            class="absolute top-0 end-0 z-30 flex items-center justify-center h-full px-4 cursor-pointer group focus:outline-none"
            data-carousel-next>
            <span
                class="inline-flex items-center justify-center w-10 h-10 rounded-full bg-white/30 dark:bg-gray-800/30 group-hover:bg-white/50 dark:group-hover:bg-gray-800/60 group-focus:ring-4 group-focus:ring-white dark:group-focus:ring-gray-800/70 group-focus:outline-none">
                <svg class="w-4 h-4 text-white dark:text-gray-800 rtl:rotate-180" aria-hidden="true"
                    xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 6 10">
                    <path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                        d="m1 9 4-4-4-4" />
                </svg>
                <span class="sr-only">Next</span>
            </span>
        </button>
</div></template>