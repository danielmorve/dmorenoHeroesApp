# HeroesApp

HeroesApp es una aplicación móvil diseñada para aficionados de los cómics, que permite a los usuarios explorar y descubrir héroes de los universos de Marvel y DC.

## Funcionalidades

### MainActivity

- Implementa una actividad de inicio de sesión.
- Utiliza una clase `User` con parámetros `email` y `password`.
- Tiene una lista estática de usuarios válidos para la autenticación.
- Valida el email introducido por el usuario; si no es válido, muestra un Snackbar con el mensaje de error.
- Si la autenticación es exitosa, navega al `PublisherActivity` y guarda una bandera `isLogged` en SharedPreferences.
- Si la aplicación se cierra y se vuelve a abrir, respeta el estado de sesión del usuario.

### PublisherActivity

- Muestra una lista de los publishers Marvel y DC utilizando un `RecyclerView` y su adaptador correspondiente.
- Crea una clase `Publisher` con propiedades `id`, `name`, e `image` (URL como String para cargar con Picasso).
- Al seleccionar Marvel o DC, navega a `HeroesActivity` pasando el `id` del publisher seleccionado.
- Botón para cerrar sesión.

### HeroesActivity

- Muestra una lista de héroes del publisher seleccionado (Marvel o DC), utilizando un `RecyclerView`.
- Al seleccionar un héroe, navega a `HeroDetailActivity` con el `id` del héroe seleccionado.

### HeroDetailActivity

- Muestra el detalle del héroe seleccionado: nombre, descripción, imagen (usa Picasso para cargar la imagen).
- Filtra el héroe seleccionado por su `id` de una lista estática de héroes.

## Requerimientos adicionales

- Utiliza SharedPreferences para mantener el estado de sesión del usuario.
- Implementa la carga de imágenes utilizando la biblioteca Picasso.
- Implementa RecyclerView y adaptadores para mostrar listas de elementos.
- Asegúrate de gestionar correctamente la navegación entre actividades.
- Añade validación de datos de entrada donde sea necesario para mejorar la experiencia del usuario.

¡Diviértete explorando el universo de los cómics con HeroesApp!
