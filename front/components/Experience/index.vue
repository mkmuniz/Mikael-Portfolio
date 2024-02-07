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
                            <NuxtLink href="https://mackleaps.mackenzie.br" target="_blank"
                                className="flex items-center justify-center">
                                <NuxtImg
                                    src="https://upload.wikimedia.org/wikipedia/commons/thumb/3/3d/Mackenzie_M.svg/1200px-Mackenzie_M.svg.png"
                                    class="min-w-[200px] max-w-[800px] w-2/5" />
                            </NuxtLink>
                        </div>
                        <div class="w-full sm:h-full flex flex-col justify-center">
                            <div class="sm:m-6">
                                <span class="text-4xl lg:text-6xl">
                                    {{ $t("experience.mackleaps_intern.title") }}
                                </span>
                                <p class="text-xl lg:text-3xl mb-12">{{ $t("experience.mackleaps_intern.time") }}</p>
                                <span class="3xl:text-2xl text-xl">
                                    {{ $t("experience.mackleaps_intern.description") }}
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
                            <NuxtLink href="https://mackleaps.mackenzie.br" target="_blank"
                                className="flex items-center justify-center">
                                <NuxtImg
                                    src="https://upload.wikimedia.org/wikipedia/commons/thumb/3/3d/Mackenzie_M.svg/1200px-Mackenzie_M.svg.png"
                                    class="min-w-[200px] max-w-[800px] w-2/5" />
                            </NuxtLink>
                        </div>
                        <div class="w-full h-full flex flex-col justify-center">
                            <div class="sm:m-6">
                                <span class="text-4xl lg:text-6xl">
                                    {{ $t("experience.mackleaps_fullstack.title") }}
                                </span>
                                <p class="text-xl lg:text-3xl mb-12">{{ $t("experience.mackleaps_fullstack.time") }}</p>
                                <span class="3xl:text-2xl text-xl">
                                    {{ $t("experience.mackleaps_fullstack.description") }}
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
                            <NuxtLink href="https://agentesdev.com.br" target="_blank" className="flex items-center justify-center">
                                <NuxtImg src="https://media-cdn.com.br/agentes-dev.png"
                                    class="min-w-[200px] max-w-[800px] w-2/5 rounded-full" />
                            </NuxtLink>
                        </div>
                        <div class="w-full h-full flex flex-col justify-center">
                            <div class="sm:m-6">
                                <span class="text-4xl lg:text-6xl">
                                    {{ $t("experience.agentesdev_fullstack.title")}}
                                </span>
                                <p class="text-xl lg:text-3xl mb-12">{{ $t("experience.agentesdev_fullstack.time")}}</p>
                                <span class="3xl:text-2xl text-xl">
                                    {{ $t("experience.agentesdev_fullstack.description")}}
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
                            <NuxtLink href="https://www.sossego.com.br" target="_blank"
                                className="flex items-center justify-center">
                                <NuxtImg
                                    src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR85LSmkiQY8CIEhzNduCTJHALMITmE762Kw4fBjFavy61W7zseUE-dDlRONPEM04wrcp8&usqp=CAU"
                                    class="min-w-[200px] mb-12 rounded-full max-w-[800px] w-2/5" />
                            </NuxtLink>
                        </div>
                        <div class="w-full h-full flex flex-col justify-center">
                            <div class="sm:m-6">
                                <span class="text-4xl lg:text-6xl">
                                    {{ $t("experience.sossego_back.title")}}
                                </span>
                                <p class="text-xl lg:text-3xl mb-12">{{ $t("experience.sossego_back.time")}}</p>
                                <span class="3xl:text-2xl text-xl">
                                    {{ $t("experience.sossego_back.description")}}
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
                            <NuxtLink href="https://www.bolha.com.br" target="_blank" className="flex items-center justify-center">
                                <NuxtImg
                                    src="https://99prod.s3.amazonaws.com/uploads/image/file/522697/bolha-logo1024x1024-azul.png"
                                    class="min-w-[200px] mb-12 max-w-[800px] w-2/5" />
                            </NuxtLink>
                        </div>
                        <div class="w-full h-full flex flex-col justify-center">
                            <div class="sm:m-6">
                                <span class="text-4xl lg:text-6xl">
                                    {{  $t("experience.bolha_fullstack.title") }}
                                </span>
                                <p class="text-xl lg:text-3xl mb-12">{{  $t("experience.bolha_fullstack.time") }}</p>
                                <span class="3xl:text-2xl text-xl">
                                    {{  $t("experience.bolha_fullstack.description") }}
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