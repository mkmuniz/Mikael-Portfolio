<template>
    <div id="about" class="min-h-screen bg-white font-hubot py-16">
        <div class="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8">
            <div class="text-center mb-12">
                <h2 class="sm:text-4xl text-2xl font-bold relative inline-block">
                    {{ $t("about.title") }}
                    <div class="absolute -bottom-2 left-0 w-full h-1 bg-standard transform -skew-x-12"></div>
                </h2>
            </div>

            <div class="grid md:grid-cols-2 gap-12 items-center">
                <div class="space-y-6">
                    <p class="mobile:text-xl text-2xl leading-relaxed text-gray-700 text-center">
                        {{ $t("about.description") }}
                    </p>
                </div>

                <div class="relative">
                    <div class="absolute -z-10 top-0 right-0 w-72 h-72 bg-blue-100 rounded-full opacity-50 blur-3xl"></div>
                    
                    <div class="bg-white p-6 rounded-lg shadow-lg">
                        <div class="grid grid-cols-2 gap-4">
                            <div v-for="(stat, i) in stats" :key="i" class="p-4 bg-gray-50 rounded-lg flex flex-col items-center justify-center">
                                <div class="h-12 w-12 flex items-center justify-center text-standard mb-2">
                                    <Icon :name="stat.icon" size="2rem" />
                                </div>
                                <p class="text-sm font-bold text-gray-800 text-center">{{ stat.value }}</p>
                                <p class="text-sm text-gray-600 text-center">{{ $t(`about.stat_${i + 1}`) }}</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script setup>
const stats = [
    { value: '3', icon: 'mdi:calendar-clock' },
    { value: '6+', icon: 'mdi:check-circle-outline' },
    { value: '4+', icon: 'mdi:office-building' },
    { value: '17', icon: 'mdi:tools' }
]
</script>