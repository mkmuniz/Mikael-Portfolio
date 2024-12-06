<template>
    <div className="flex items-center justify-center h-screen 3xl:container 3xl:mx-auto px-8">
        <div class="grid sm:grid-cols-2 grid-cols-1 h-screen gap-x-12">
            <div class="w-full flex items-center justify-center transform hover:scale-105 transition-transform duration-300">
                <NuxtLink :href="link" target="_blank"
                    className="flex items-center justify-center hover:opacity-80 transition-opacity">
                    <NuxtImg
                        :src="image"
                        :class="`min-w-[200px] max-w-[800px] w-2/5 drop-shadow-2xl ${imageClass}`" />
                </NuxtLink>
            </div>
            <div class="w-full sm:h-full flex flex-col justify-center p-6 backdrop-blur-sm bg-black/10 rounded-xl">
                <div class="flex flex-col gap-y-6">
                    <span class="text-4xl font-bold bg-clip-text text-transparent bg-gradient-to-r from-red-400 to-red-600">
                        {{ title }}
                    </span>
                    <p class="text-xl text-gray-300">({{ time }})</p>
                    <span class="3xl:text-2xl text-gray-200 leading-relaxed">
                        {{ description }}
                    </span>
                    <div class="flex flex-col gap-2">
                        <span class="text-sm text-gray-400">TECNOLOGIAS</span>
                        <span class="3xl:text-xl text-gray-200 font-mono">
                            {{ stacks }}
                        </span>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script setup>
defineProps({
    title: String,
    time: String,
    description: String,
    stacks: String,
    image: String,
    link: String,
    imageClass: {
        type: String,
        default: ''
    }
})
</script> 