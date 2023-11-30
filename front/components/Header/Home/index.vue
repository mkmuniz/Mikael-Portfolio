<template>
    <div class="w-full h-screen text-white font-hubot">
        <div class="grid sm:grid-cols-2">
            <div class="h-screen flex justify-center items-center m-2 sm:text-left text-center">
                <span>
                    <h1 class="text-5xl font-bold text-standard">
                        Yo, welcome!
                    </h1>
                    <p class="ml-2">
                        Full Stack Developer
                    </p>
                    <div class="flex space-x-3 ml-1 sm:justify-start justify-center">
                        <NuxtLink to="https://github.com/mkmuniz" target="_blank" class="text-4xl transition-all hover:text-standard">
                            <Icon name="uil:github" />
                        </NuxtLink>
                        <NuxtLink to="https://www.linkedin.com/in/mikael-muniz-ribeiro-5764961a3/" target="_blank" class="text-4xl transition-all hover:text-standard">
                            <Icon name="uil:linkedin" />
                        </NuxtLink>
                    </div>
                </span>
            </div>
            <div class="w-full sm:flex items-center justify-center sm:visible hidden">
                <NuxtImg src="/images/logo.png" />
            </div>
        </div>
    </div>
</template>