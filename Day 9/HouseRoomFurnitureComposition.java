import java.util.ArrayList;
import java.util.List;

public class HouseRoomFurnitureComposition {
    public static void main(String[] args) {
        System.out.println("=== Composition Demo: House -> Room -> Furniture ===");
        House myHouse = new House("123 Maple Street, Springfield");

        myHouse.addRoom("Living Room");
        myHouse.addFurnitureToRoom("Living Room", new Furniture("Sofa", "Leather"));
        myHouse.addFurnitureToRoom("Living Room", new Furniture("Coffee Table", "Oak Wood"));

        myHouse.addRoom("Master Bedroom");
        myHouse.addFurnitureToRoom("Master Bedroom", new Furniture("King Size Bed", "Memory Foam"));
        myHouse.addFurnitureToRoom("Master Bedroom", new Furniture("Wardrobe", "Teak Wood"));

        myHouse.displayHouseDetails();
    }
}

class Furniture {
    private String name;
    private String material;

    public Furniture(String name, String material) {
        this.name = name;
        this.material = material;
    }

    public void display() {
        System.out.printf("    - %s (%s)%n", name, material);
    }
}

class Room {
    private String roomName;
    private List<Furniture> furnitures; // Composition: Room owns Furniture

    public Room(String roomName) {
        this.roomName = roomName;
        this.furnitures = new ArrayList<>();
    }

    public String getRoomName() { return roomName; }

    public void addFurniture(Furniture furniture) {
        furnitures.add(furniture);
    }

    public void displayRoom() {
        System.out.println("  [Room] " + roomName);
        if (furnitures.isEmpty()) {
            System.out.println("    - No furniture installed.");
        } else {
            for (Furniture f : furnitures) {
                f.display();
            }
        }
    }
}

class House {
    private String address;
    private List<Room> rooms; // Composition: House owns Rooms

    public House(String address) {
        this.address = address;
        this.rooms = new ArrayList<>();
    }

    public void addRoom(String roomName) {
        rooms.add(new Room(roomName));
    }

    public void addFurnitureToRoom(String roomName, Furniture furniture) {
        for (Room r : rooms) {
            if (r.getRoomName().equalsIgnoreCase(roomName)) {
                r.addFurniture(furniture);
                return;
            }
        }
        System.out.println("Room " + roomName + " not found!");
    }

    public void displayHouseDetails() {
        System.out.println("House Address: " + address);
        for (Room r : rooms) {
            r.displayRoom();
        }
    }
}
