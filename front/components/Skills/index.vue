<template>
    <div class="min-h-screen h-full bg-white text-center font-bold grid content-center" id="skills">
        <div class="h-full container mx-auto sm:mt-0 sm:mb-0 mb-6 mt-6">
            <h1 class="sm:text-6xl 3xl:text-8xl text-4xl">SKILLS</h1>
            <div class="grid sm:grid-cols-3 grid-cols-2 content-center place-items-center w-full">
                <div
                    class="w-32 h-32 3xl:w-64 3xl:h-64 border border-s-4 shadow flex flex-col items-center justify-center rounded mt-6 hover:scale-90 transition-all duration-300">
                    <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/nodejs/nodejs-original-wordmark.svg"
                        class="w-16 h-16 3xl:h-32 3xl:w-32" />
                    <span class="text-xl 3xl:text-2xl">
                        {{ $t("skills.nodejs") }}
                    </span>
                </div>
                <div
                    class="w-32 h-32 3xl:w-64 3xl:h-64 border border-s-4 shadow flex flex-col items-center justify-center rounded mt-6 hover:scale-90 transition-all duration-300">
                    <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/typescript/typescript-original.svg"
                        class="w-16 h-16 rounded-lg 3xl:h-32 3xl:w-32" />
                    <span class="text-xl 3xl:text-2xl">
                        {{ $t("skills.typescript") }}
                    </span>
                </div>
                <div
                    class="w-32 h-32 3xl:w-64 3xl:h-64 border border-s-4 shadow flex flex-col items-center justify-center rounded mt-6 hover:scale-90 transition-all duration-300">
                    <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/docker/docker-plain-wordmark.svg"
                        class="w-16 h-16 rounded-lg 3xl:h-32 3xl:w-32" />
                    <span class="text-xl 3xl:text-2xl">
                        {{ $t("skills.docker") }}
                    </span>
                </div>
                <div
                    class="w-32 h-32 3xl:w-64 3xl:h-64 border border-s-4 shadow flex flex-col items-center justify-center rounded mt-6 hover:scale-90 transition-all duration-300">
                    <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/mongodb/mongodb-plain-wordmark.svg"
                        class="w-16 h-16 rounded-lg 3xl:h-32 3xl:w-32" />
                    <span class="text-xl 3xl:text-2xl">
                        {{ $t("skills.mongodb") }}
                    </span>
                </div>
                <div
                    class="w-32 h-32 3xl:w-64 3xl:h-64 border border-s-4 shadow flex flex-col items-center justify-center rounded mt-6 hover:scale-90 transition-all duration-300">
                    <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/mysql/mysql-original-wordmark.svg"
                        class="w-16 h-16 rounded-lg 3xl:h-32 3xl:w-32" />
                    <span class="text-xl 3xl:text-2xl">
                        {{ $t("skills.mysql") }}
                    </span>
                </div>
                <div
                    class="w-32 h-32 3xl:w-64 3xl:h-64 border border-s-4 shadow flex flex-col items-center justify-center rounded mt-6 hover:scale-90 transition-all duration-300">
                    <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/react/react-original.svg"
                        class="w-16 h-16 3xl:h-32 3xl:w-32" />
                    <span class="text-xl 3xl:text-2xl">
                        {{ $t("skills.react") }}
                    </span>
                </div>
                <div
                    class="w-32 h-32 3xl:w-64 3xl:h-64 border border-s-4 shadow flex flex-col items-center justify-center rounded mt-6 hover:scale-90 transition-all duration-300">
                    <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/python/python-original-wordmark.svg"
                        class="w-16 h-16 3xl:h-32 3xl:w-32" />
                    <span class="text-xl 3xl:text-2xl">
                        {{ $t("skills.python") }}
                    </span>
                </div>
                <div
                    class="w-32 h-32 3xl:w-64 3xl:h-64 border border-s-4 shadow flex flex-col items-center justify-center rounded mt-6 hover:scale-90 transition-all duration-300">
                    <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/go/go-original-wordmark.svg"
                        class="w-16 h-16 3xl:h-32 3xl:w-32" />
                    <span class="text-xl 3xl:text-2xl">
                        {{ $t("skills.golang") }}
                    </span>
                </div>
                <div
                    class="w-32 h-32 3xl:w-64 3xl:h-64 border border-s-4 shadow flex flex-col items-center justify-center rounded mt-6 hover:scale-90 transition-all duration-300">
                    <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/amazonwebservices/amazonwebservices-original-wordmark.svg"
                        class="w-16 h-16 3xl:h-32 3xl:w-32" />
                    <span class="text-xl 3xl:text-2xl">
                        {{ $t("skills.aws") }}
                    </span>
                </div>
            </div>
        </div>
    </div>
</template>