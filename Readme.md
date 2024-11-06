# Evidencia 8 
## - identifique las clases presentes

## - identifique las relaciones presentes

## - detalle las relaciones (roles, multiplicidades, etc)

## - detalle las clases sólo con atributos y métodos que pueda identificar

## - genere el código para un caso en específico que permita realizar las actividades CRUD (crear, leer, actualizar y borrar objetos)

## Contenidos
- ### Caso 1: Empresa transporte

    ### - Clases, atributos y metodos:

    - ### Empresa: String nombre, String direccion, List<Bus> buses. agregarBus(), removerBus(), listarBuses(), venderBus().

    - ### Bus: String matricula, String modelo, int año. VenderATercero().

    - ### Tercero: String nombre, int contacto.

    ### - Relaciones y detalles: 
    - ###  Empresa y Bus es de composicion 1 a muchos, ya que una empresa puede tener muchos buses, roles: empresa - buses.
    - ### Bus y comprador es de asociacion 1.* - 0.1, *roles: buses - comprador.*

- ### Caso 2: Cuaderno Universitario

    ### - Clases, atributos y metodos:

    - ### Cuaderno: String marca, List<Hoja> hojas. escribirEnLaHoja(), arrancarHoja(), listarHojas().

    - ### Hoja: int numero, String contenido. escribir(), vaciar().

    ### - Relaciones y detalles: 
    - ###  Cuaderno y Hoja es de composicion 1 a 100, ya que un cuaderno se puede componer de 100 hojas si no hay hojas, no hay cuaderno, *roles: cuaderno - hojas.*

- ### Caso 3: Relacion amistad

    ### - Clases, atributos y metodos:

    - ### Persona: String nombre, int edad, String amigos. agregarAmigo(), eliminarAmigos(), listarAmigos().

    ### - Relaciones y detalles: 
    - ###  La verdad es que no entendi muy bien este pero se asocia asi mismo(?) como yo decido quienes concidero o no amigos.

- ### Caso 4: Equipo

    ### - Clases, atributos y metodos:

    - ### Equipo: String nombre, List<Jugador> jugadores, Jugador capitan. agregarJugador(), asignarCapitan(), listarJugadores().

    - ### Jugador: String nombre, int numero, String posicion. actualizarPosicion().

    ### - Relaciones y detalles: 
    - ###  Equipo y Jugador se compone de 2 relaciones, ambas de asociacion (podria haber puesto una de composicion pero no me tincaba), una es para equipo(1) y los respectivos jugadores(1..*) y el otro es para el equipo y el capitan (1 a 1) de es equipo. roles: equipo - jugador, equipo - capitan.

- ### Caso 5: Empresa

    ### - Clases, atributos y metodos:

    - ### Empresa: String nombre, List<Departamento> departamentos, List<Oficina> oficinas. agregarDepartamento(), agregarOficina().

    - ### Departamento: String nombre, List<Empleado> empleados, Empleado administrador. agregarEmpleado(), asignarAdministrador().

    - ### Oficina: String ubicacion, String tipo. actualizarTipo().

    - ### Empleado: String nombre, String cargo. actualizarCargo().

    - ### OficinaCentral: String nombreDirecto.

    ### - Relaciones y detalles: 
    - ###  Empresa y departamento es de agregacion (1 - 0.*), Departamento y Empleado tiene dos relaciones, una de composicion (1 - 1.muchos) y el otro de asociacion para el administrador (1 - 1), Empresa y Oficina es de asociacion (1 - 0.muchos), Oficina y OficinaCentral es de generalizacion, ya que OficinaCentral hereda de Oficina. Roles empresa - departamentos, departamento - empleados, departamento - administrador, Empresa - oficinas.

    #### Asi es como comence con la evidencia, puede que algunos esten malo o me equivoque en escribir en el readme o en el mismo diagrama
