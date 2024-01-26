<template>
    <div class="w-full h-screen text-white font-hubot select-none 3xl:container 3xl:mx-auto">
        <div class="sm:grid sm:grid-cols-2 flex flex-col items-center h-screen">
            <div class="sm:h-screen h-full flex justify-center items-center sm:text-left text-center">
                <span>
                    <div class="w-full flex items-center justify-center sm:hidden visible mb-4">
                        <NuxtImg src="/images/logo.png" class="w-2/4 max-w-[500px]" />
                    </div>
                    <h1 class="text-5xl 3xl:text-7xl font-bold text-standard">
                        Yo, welcome!
                    </h1>
                    <p class="mt-2 ml-2 text-2xl">
                        Full Stack Developer
                    </p>
                    <div class="flex space-x-3 ml-1 sm:justify-start justify-center">
                        <NuxtLink to="https://github.com/mkmuniz" target="_blank"
                            class="text-4xl transition-all hover:text-standard">
                            <Icon name="uil:github" />
                        </NuxtLink>
                        <NuxtLink to="https://www.linkedin.com/in/mikael-muniz-ribeiro-5764961a3/" target="_blank"
                            class="text-4xl transition-all hover:text-standard">
                            <Icon name="uil:linkedin" />
                        </NuxtLink>
                    </div>
                </span>
            </div>
            <div class="w-full sm:flex items-center justify-center sm:visible hidden">
                <NuxtImg src="/images/logo.png" class="w-2/4 max-w-[500px]" />
            </div>
        </div>
    </div>
</template>