package tema;

import java.util.ArrayList;
import java.util.List;

class Position {
    int x, y;

    Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Size {
    int width, length;

    Size(int width, int length) {
        this.width = width;
        this.length = length;
    }
}

class House {
    String sceneType;
    String materials;
    Position position;
    Size size;

    House(String sceneType, String materials, Position position, Size size) {
        this.sceneType = sceneType;
        this.materials = materials;
        this.position = position;
        this.size = size;
    }

    void render() {
        System.out.println("House - Scene: " + sceneType + ", Materials: " + materials +
                ", Position: (" + position.x + ", " + position.y + "), Size: (" + size.width + " x " + size.length + ")");
    }
}

class Character {
    String characterType;
    int age;
    Position position;

    Character(String characterType, int age) {
        this.characterType = characterType;
        this.age = age;
        this.position = new Position(0, 0);
    }

    void moveTo(Position newPosition) {
        // Validation logic to check if the new position is valid
        // ...

        // If valid, update the position
        this.position = newPosition;

        System.out.println("Character - Type: " + characterType + ", Age: " + age +
                ", Position: (" + position.x + ", " + position.y + ")");
    }
}

class Group {
    String groupType;
    List<Character> characters;

    Group(String groupType, List<Character> characters) {
        this.groupType = groupType;
        this.characters = characters;
    }

    void moveTo(Position newPosition) {
        // Validation logic to check if the new position is valid for the entire group
        // ...

        // If valid, update the position for each character in the group
        for (Character character : characters) {
            character.moveTo(newPosition);
        }
    }
}

class GameBoard {
    int width, length;
    List<House> houses;
    List<Character> characters;

    GameBoard(int width, int length, List<House> houses) {
        this.width = width;
        this.length = length;
        this.houses = houses;
        this.characters = new ArrayList<>();
    }

    void addObject(Object gameObject) {
        // Validation logic to check if the new object can be added
        // ...
    }

    void render() {
        for (House house : houses) {
            house.render();
        }

        for (Character character : characters) {
            character.moveTo(character.position); // Print the current position and details
        }
    }
}

public class GameSimulation {
    public static void main(String[] args) {
        // Example usage
        List<House> houses = new ArrayList<>();
        houses.add(new House("European", "Concrete", new Position(2, 3), new Size(5, 5)));
        houses.add(new House("Asian", "Bamboo", new Position(8, 10), new Size(6, 6)));

        GameBoard gameBoard = new GameBoard(15, 15, houses);

        List<Character> characters = new ArrayList<>();
        characters.add(new Character("Human", 25));
        characters.add(new Character("Elf", 150));

        gameBoard.characters.addAll(characters);

        // Perform some moves
        characters.get(0).moveTo(new Position(3, 4));
        characters.get(1).moveTo(new Position(9, 11));

        // Render the game board to check positions and details
        gameBoard.render();
    }
}
