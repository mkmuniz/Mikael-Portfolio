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
    <div id="experience" class="relative w-full font-hubot text-white sm:text-left text-center 3xl:container 3xl:mx-auto" data-carousel="slide">
        <div class="relative h-screen overflow-hidden">
            <div class="hidden duration-700 h-screen ease-in-out select-none" data-carousel-item>
                <div className="flex items-center justify-center h-screen 3xl:container 3xl:mx-auto">
                    <div class="grid sm:grid-cols-2 grid-cols-1 h-screen">
                        <div class="w-full flex items-center justify-center">
                            <a href="https://mackleaps.mackenzie.br" target="_blank"
                                className="flex items-center justify-center">
                                <NuxtImg
                                    src="https://upload.wikimedia.org/wikipedia/commons/thumb/3/3d/Mackenzie_M.svg/1200px-Mackenzie_M.svg.png"
                                    class="min-w-[200px] max-w-[800px] w-2/5" />
                            </a>
                        </div>
                        <div class="w-full sm:h-full flex flex-col justify-center">
                            <div class="sm:m-6">
                                <span class="text-4xl lg:text-6xl">
                                    MACKLEAPS - Full Stack Intern
                                </span>
                                <p class="text-xl lg:text-3xl mb-12">06/2020 - 06/2022</p>
                                <span class="lg:text-2xl">
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
                    </div>
                </div>
            </div>
            <div class="hidden duration-700 ease-in-out select-none" data-carousel-item>
                <div className="flex items-center justify-center h-screen 3xl:container 3xl:mx-auto">
                    <div class="grid sm:grid-cols-2 grid-cols-1 h-screen">
                        <div class="w-full flex items-center justify-center">
                            <a href="https://mackleaps.mackenzie.br" target="_blank"
                                className="flex items-center justify-center">
                                <NuxtImg
                                    src="https://upload.wikimedia.org/wikipedia/commons/thumb/3/3d/Mackenzie_M.svg/1200px-Mackenzie_M.svg.png"
                                    class="min-w-[200px] max-w-[800px] w-2/5" />
                            </a>
                        </div>
                        <div class="w-full h-full flex flex-col justify-center">
                            <div class="sm:m-6">
                                <span class="text-4xl lg:text-6xl">
                                    MACKLEAPS - Full Stack Developer
                                </span>
                                <p class="text-xl lg:text-3xl mb-12">08/2022 - 01/2023</p>
                                <span class="lg:text-2xl">
                                    Responsible by guide & teach new
                                    interns, leadership, tasks
                                    organizations, project
                                    management & development in
                                    Back-End and Front-End.
                                    Participated in ACSP website
                                    development
                                    TypeScript, React, NodeJS, Python,
                                    NestJS, Docker, Ruby,
                                    PostgreSQL, MongoDB & MySQL.
                                </span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="hidden duration-700 ease-in-out select-none" data-carousel-item>
                <div className="flex items-center justify-center h-screen 3xl:container 3xl:mx-auto">
                    <div class="grid sm:grid-cols-2 grid-cols-1 h-screen">
                        <div class="flex items-center justify-center">
                            <a href="https://agentesdev.com.br" target="_blank" className="flex items-center justify-center">
                                <NuxtImg src="https://d1i4dnh5d3693f.cloudfront.net/agentes-dev.png"
                                    class="min-w-[200px] max-w-[800px] w-2/5 rounded-full" />
                            </a>
                        </div>
                        <div class="w-full h-full flex flex-col justify-center">
                            <div class="sm:m-6">
                                <span class="text-4xl lg:text-6xl">
                                    AgentesDev - Full Stack Developer
                                </span>
                                <p class="text-xl lg:text-3xl mb-12">06/2022 - Current</p>
                                <span class="lg:text-2xl">
                                    Participated in UJL Portal
                                    Web scraper development.
                                    TypeScript, JavaScript, Express
                                    NextJS, HTML5, CSS, Sass Tailwind
                                    & Python
                                </span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="hidden duration-700 ease-in-out select-none" data-carousel-item>
                <div className="flex items-center justify-center h-screen 3xl:container 3xl:mx-auto">
                    <div class="grid sm:grid-cols-2 grid-cols-1 h-screen">
                        <div class="flex items-center justify-center">
                            <a href="https://www.sossego.com.br" target="_blank"
                                className="flex items-center justify-center">
                                <NuxtImg
                                    src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR85LSmkiQY8CIEhzNduCTJHALMITmE762Kw4fBjFavy61W7zseUE-dDlRONPEM04wrcp8&usqp=CAU"
                                    class="min-w-[200px] mb-12 rounded-full max-w-[800px] w-2/5" />
                            </a>
                        </div>
                        <div class="w-full h-full flex flex-col justify-center">
                            <div class="sm:m-6">
                                <span class="text-4xl lg:text-6xl">
                                    Sossego - Back End Developer
                                </span>
                                <p class="text-xl lg:text-3xl mb-12">01/2023 - 08/2023</p>
                                <span class="lg:text-2xl">
                                    Encharged to create &
                                    maintenance robots for webscraping using Playwright, NodeJS,
                                    NestJS, Python, Docker &
                                    development in API's.
                                </span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="hidden duration-700 ease-in-out select-none" data-carousel-item>
                <div className="flex items-center justify-center h-screen 3xl:container 3xl:mx-auto">
                    <div class="grid sm:grid-cols-2 grid-cols-1 h-screen">
                        <div class="flex items-center justify-center">
                            <a href="https://www.bolha.com.br" target="_blank" className="flex items-center justify-center">
                                <NuxtImg
                                    src="https://99prod.s3.amazonaws.com/uploads/image/file/522697/bolha-logo1024x1024-azul.png"
                                    class="min-w-[200px] mb-12 max-w-[800px] w-2/5" />
                            </a>
                        </div>
                        <div class="w-full h-full flex flex-col justify-center">
                            <div class="sm:m-6">
                                <span class="text-4xl lg:text-6xl">
                                    Bolha - Full Stack Developer
                                </span>
                                <p class="text-xl lg:text-3xl mb-12">01/2024 - Current</p>
                                <span class="lg:text-2xl">
                                    Encharged to
                                    develop/maintenance websites
                                    and APIs for our clients using Next JS/React,
                                    PHP, Cosmic, Strapi, TypeScript, NodeJS & AWS.
                                </span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="absolute z-30 flex -translate-x-1/2 bottom-5 left-1/2 space-x-3 rtl:space-x-reverse">
            <button type="button" class="w-3 h-3 rounded-full" aria-current="true" aria-label="Slide 1"
                data-carousel-slide-to="0"></button>
            <button type="button" class="w-3 h-3 rounded-full" aria-current="false" aria-label="Slide 2"
                data-carousel-slide-to="1"></button>
            <button type="button" class="w-3 h-3 rounded-full" aria-current="false" aria-label="Slide 3"
                data-carousel-slide-to="2"></button>
            <button type="button" class="w-3 h-3 rounded-full" aria-current="false" aria-label="Slide 4"
                data-carousel-slide-to="3"></button>
            <button type="button" class="w-3 h-3 rounded-full" aria-current="false" aria-label="Slide 5"
                data-carousel-slide-to="3"></button>
        </div>
        <!-- Slider controls -->
        <button type="button"
            class="absolute top-0 start-0 z-30 flex items-center justify-center h-full px-4 cursor-pointer group focus:outline-none"
            data-carousel-prev>
            <span
                class="inline-flex items-center justify-center w-10 h-10 rounded-full group-focus:ring-4 group-focus:ring-white group-focus:outline-none">
                <svg class="w-4 h-4 text-white rtl:rotate-180" aria-hidden="true"
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
                class="inline-flex items-center justify-center w-10 h-10 rounded-full group-focus:ring-4 group-focus:ring-white group-focus:outline-none">
                <svg class="w-4 h-4 text-white rtl:rotate-180" aria-hidden="true"
                    xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 6 10">
                    <path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                        d="m1 9 4-4-4-4" />
                </svg>
                <span class="sr-only">Next</span>
            </span>
        </button>
    </div>
</template>