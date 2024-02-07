<template>
    <div id="about" class="grid w-full h-screen bg-white font-hubot">
        <div class="flex flex-col w-full items-center justify-center 3xl:container 3xl:mx-auto">
            <span class="sm:text-6xl 3xl:text-8xl text-4xl mb-12 justify-center m-6 text-center">
                {{ $t("about.title") }}
            </span>
            <div class="text-center m-6">
                <p class="text-xl 3xl:text-3xl">
                    {{  $t("about.description") }}
                </p>
            </div>
        </div>
    </div>
</template>