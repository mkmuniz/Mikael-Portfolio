<template>
    <div class="w-full h-screen text-white font-hubot select-none 3xl:container 3xl:mx-auto">
        <div class="sm:grid sm:grid-cols-2 flex flex-col items-center h-screen">
            <div class="sm:h-screen h-full flex justify-center items-center sm:text-left text-center">
                <span>
                    <div class="w-full flex items-center justify-center sm:hidden visible mb-4">
                        <NuxtImg src="/images/logo.png" class="w-2/4 max-w-[500px]" />
                    </div>
                    <div class="p-3">
                        <h1 class="text-5xl 3xl:text-7xl font-bold text-standard">
                            {{ $t("header.welcome") }}
                        </h1>
                        <p class="text-2xl mt-2">
                            {{ $t("header.role") }}
                        </p>
                    </div>
                    <div class="flex space-x-3 p-3 sm:justify-start justify-center">
                        <NuxtLink to="https://github.com/mkmuniz" target="_blank"
                            class="text-4xl transition-all hover:text-standard">
                            <Icon name="uil:github" />
                        </NuxtLink>
                        <NuxtLink to="https://www.linkedin.com/in/mikael-muniz-ribeiro/" target="_blank"
                            class="text-4xl transition-all hover:text-standard">
                            <Icon name="uil:linkedin" />
                        </NuxtLink>
                        <NuxtLink to="https://linktr.ee/mkmuniz" target="_blank"
                            class="text-4xl transition-all hover:text-standard">
                            <Icon name="icon-park-outline:link-three" />
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