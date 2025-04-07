<template>
    <div class="w-full lg:h-screen text-white font-hubot select-none 3xl:container 3xl:mx-auto">
        <div class="lg:grid lg:grid-cols-2 flex flex-col items-center lg:h-screen">
            <div class="h-screen flex justify-center items-center sm:text-left text-center">
                <span>
                    <div class="w-full flex items-center justify-center lg:hidden visible mb-4">
                        <NuxtImg src="/images/header-background-mikael.png" class="w-[50%] max-w-[500px]" />
                    </div>
                    <div class="p-3 tablet:text-center">
                        <p class="text-3xl text-standard">
                            {{ $t("header.welcome") }}
                        </p>
                        <h1 class="text-5xl">Mikael Muniz Ribeiro</h1>
                        <p class="text-4xl mt-2">
                            {{ $t("header.role") }}
                        </p>
                    </div>
                    <div class="flex space-x-3 p-3 lg:justify-start justify-center">
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
            <div class="w-full lg:flex items-center justify-center lg:visible hidden">
                <NuxtImg src="/images/header-background-mikael.png" class="w-2/4 max-w-[500px]" />
            </div>
        </div>
    </div>
</template>