<template>
    <div id="about" class="grid w-full h-screen bg-white font-hubot">
        <div class="flex flex-col w-full items-center justify-center 3xl:container 3xl:mx-auto p-6 mobile:p-3">
            <span class="sm:text-4xl text-2xl justify-center text-center">
                {{ $t("about.title") }}
            </span>
            <div class="text-center m-6">
                <p class="mobile:text-xl text-2xl">
                    {{ $t("about.description") }}
                </p>
            </div>
        </div>
    </div>
</template>