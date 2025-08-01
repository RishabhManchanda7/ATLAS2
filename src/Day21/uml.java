package Day21;

@startuml
class Car {
  -engine: Engine
  +start(): void
}

class Engine {
  +ignite(): void
}

Car --> Engine
@enduml