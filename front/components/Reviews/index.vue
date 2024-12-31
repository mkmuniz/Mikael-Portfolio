<template>
  <section id="reviews" class="w-full min-h-screen bg-black py-20 px-4">
    <div class="container mx-auto px-4">
      <div class="text-center mb-16">
        <h2 class="text-4xl font-bold text-white inline-block relative">
          {{ $t('reviews.title') }}
          <span class="absolute left-0 bottom-[-8px] w-full h-1 bg-red-600"></span>
        </h2>
      </div>
      
      <div class="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-8">
        <div v-for="(review, index) in localizedReviews" :key="index" 
             class="bg-zinc-900 p-8 rounded-lg border border-zinc-800 hover:border-red-600 transition-all duration-300 relative group">
          <div class="absolute -top-4 right-8 text-red-600 text-6xl opacity-10 group-hover:opacity-20 transition-opacity duration-300">
            "
          </div>
          <div class="flex items-center mb-6">
            <img :src="review.image" :alt="review.name" 
                 class="w-16 h-16 rounded-full object-cover mr-4 border-2 border-red-600">
            <div>
              <h3 class="font-semibold text-lg text-white">{{ review.name }}</h3>
              <p class="text-gray-400 text-sm">{{ review.position }}</p>
            </div>
          </div>
          <p class="text-gray-300 leading-relaxed relative z-10">{{ review.comment }}</p>
        </div>
      </div>
    </div>
  </section>
</template>

<script setup>
const { locale } = useI18n()

const reviews = ref([
  {
    name: "Mário Vasconcelos",
    positionKey: "ia_engineer",
    image: "./images/mario_vasconcelos.png",
    comments: {
      "pt-BR": "Mikael trabalhou nos dois maiores projetos do AgentesDev, no início como o único desenvolvedor, e conseguiu criar, em tempo recorde, aplicações utilizando ferramentas modernas, além de estar sempre de prontidão para dar manutenção nos nossos sistemas. Com expertise em TypeScript, Go e qualquer Cloud possível, certamente é capaz de enfrentar todo tipo de desafio.",
      "en-US": "Mikael worked on AgentesDev's two largest projects, initially as the sole developer, and managed to create applications using modern tools in record time, while always being ready to maintain our systems. With expertise in TypeScript, Go, and any possible Cloud, he is certainly capable of facing all kinds of challenges."
    }
  },
  {
    name: "Carol Cardoso",
    positionKey: "owner",
    image: "./images/carolis_cardoso.png",
    comments: {
      "pt-BR": "O Mika é uma pessoa muito agradável de trabalhar junto no dia a dia. É fácil de conversar, é proativo em solucionar os desafios das demandas que aparecem, e está sempre disponível para ajudar os outros. Sempre mostrou dedicação e senso de dono com os projetos, pensando à frente de cada passo, de um jeito muito responsável e pé no chão. Tenho certeza de que vai ter muito sucesso na carreira, e espero que trabalhemos juntos em projetos mais vezes!",
      "en-US": "Mika is a very pleasant person to work with on a daily basis. He's easy to talk to, proactive in solving challenges that arise, and always available to help others. He has always shown dedication and ownership of projects, thinking ahead of each step in a very responsible and grounded way. I'm sure he will have great success in his career, and I hope we work together on projects more often!"
    }
  },
  {
    name: "Bruna Markowisk",
    positionKey: "software_dev",
    image: "./images/bruna_markowisk.png",
    comments: {
      "pt-BR": "Tenho o prazer de recomendar o Mikael Muniz, com quem tive o prazer de trabalhar na AgentesDev. Mikael sempre completou todas as tarefas no prazo, demonstrando excepcional confiabilidade e dedicação ao seu trabalho. Ele tem um forte desejo de assumir projetos diversos e está sempre com a mente aberta quando se trata de se adaptar a requisitos em mudança. Sua flexibilidade garante que nossos projetos possam evoluir conforme necessário, o que é crucial em nosso ambiente acelerado. Além disso, quando a inovação é necessária, Mikael é a pessoa ideal para liderar. Ele tem uma capacidade natural de pensar criativamente e propor ideias novas, tornando-o um ativo para qualquer equipe.",
      "en-US": "I am pleased to recommend Mikael Muniz, with whom I have had the pleasure of working at AgentesDev. Mikael consistently completed all tasks on time, demonstrating exceptional reliability and dedication to his work. He has a strong desire to take on diverse projects and is always open-minded when it comes to adapting to changing requirements. His flexibility ensures that our projects can evolve as needed, which is crucial in our fast-paced environment. Moreover, when innovation is necessary, Mikael is the ideal person to lead the charge. He has a natural ability to think creatively and propose fresh ideas, making him an asset to any team."
    }
  },
])

const localizedReviews = computed(() => {
  return reviews.value.map(review => ({
    ...review,
    position: useNuxtApp().$i18n.t(`reviews.positions.${review.positionKey}`),
    comment: review.comments[locale.value]
  }))
})
</script>

<style scoped>
.group:hover {
  transform: translateY(-5px);
  box-shadow: 0 10px 30px -15px rgba(255, 0, 0, 0.2);
}
</style>
