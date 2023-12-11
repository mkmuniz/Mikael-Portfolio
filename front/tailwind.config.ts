import type { Config } from 'tailwindcss'

export default <Partial<Config>>{
  content: [
    // other files...
    "./node_modules/flowbite/**/*.{js,ts}"
  ],
  theme: {
    extend: {
      plugins: [
        require('flowbite/plugin')
      ],

      colors: {
        standard: "#FC1616"
      },
      fontFamily: {
        hubot: ['HUBOT', 'cursive'],
      },
      container: {
        padding: {
          DEFAULT: '1rem',
          sm: '2rem',
          lg: '4rem',
          xl: '5rem',
          '2xl': '6rem',
        },
      },
    }
  }
}
