import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SystemTrain {
    public ArrayList<Locomotive> locomotives = new ArrayList();
    public ArrayList<Plackart> plackarts = new ArrayList();
    public ArrayList<Luxury> luxuries = new ArrayList();
    public ArrayList<Freight> freights = new ArrayList();
    public ArrayList<Wagon> wagons = new ArrayList();

    public SystemTrain() {
    }

    public void Begin() {
        Scanner scanner = new Scanner(System.in);
        int menu = 0;

        while(menu != 6) {
            System.out.println("1. To add Locomotive\n2. To add Wagon\n3. To find Locomotive\n4. To find Wagon\n5. List of Direction\n6. Exit from System");
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    this.addLoco();
                    break;
                case 2:
                    this.addWagon();
                    break;
                case 3:
                    this.findLoco();
                    break;
                case 4:
                    this.findWagon();
                    break;
                case 5:
                    this.direction();
                    break;
                case 6:
                    this.toExit();
            }
        }

    }

    public void addLoco() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input speed for locomotive: ");
        String speed = scanner.nextLine();
        System.out.println("Input max wagon for locomotive: ");
        String emptyCapacity = scanner.nextLine();
        System.out.println("Input travel time: ");
        String timeInWay = scanner.nextLine();
        System.out.println("Input direction: ");
        String direction = scanner.nextLine();
        System.out.println("Input id of locomotive: ");
        String id = scanner.nextLine();
        Locomotive l = new Locomotive(speed, emptyCapacity, id, direction, timeInWay);
        this.locomotives.add(l);
    }

    public void addWagon() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter type of wagon: ");
        String type = scanner.nextLine();
        String id;
        String maxCapacity;
        if (type.equals("Plackart")) {
            System.out.println("Input id of wagon: ");
            id = scanner.nextLine();
            System.out.println("Input max capacity of wagon: ");
            maxCapacity = scanner.nextLine();
            Plackart plackart = new Plackart(id, type, maxCapacity);
            this.plackarts.add(plackart);
            this.wagons.add(plackart);
        }

        if (type.equals("Luxury")) {
            System.out.println("Input id of wagon: ");
            id = scanner.nextLine();
            System.out.println("Input max capacity of wagon: ");
            maxCapacity = scanner.nextLine();
            Luxury luxury = new Luxury(id, type, maxCapacity);
            this.luxuries.add(luxury);
            this.wagons.add(luxury);
        }

        if (type.equals("Freight")) {
            System.out.println("Input id of wagon: ");
            id = scanner.nextLine();
            System.out.println("Input max capacity of wagon: ");
            maxCapacity = scanner.nextLine();
            Freight freight = new Freight(id, type, maxCapacity);
            this.freights.add(freight);
            this.wagons.add(freight);
        }

    }

    public void findLoco() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id of locomotive: ");
        String id = sc.nextLine();
        Iterator var3 = this.locomotives.iterator();

        while(var3.hasNext()) {
            Locomotive locomotive = (Locomotive)var3.next();
            if (id.equals(locomotive.getId())) {
                PrintStream var10000 = System.out;
                String var10001 = locomotive.getId();
                var10000.println("Id is: " + var10001 + "\nSpeed is: " + locomotive.getSpeed() + "\nmaximum number of wagons: " + locomotive.getEmptyCapacity() + "\nDirection: " + locomotive.getDirection() + "\nTravel time: " + locomotive.getTimeInWay() + "\n");
            }
        }

    }

    public void findWagon() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id of wagon: ");
        String id = scanner.nextLine();
        Iterator var3 = this.wagons.iterator();

        while(var3.hasNext()) {
            Wagon wagon = (Wagon)var3.next();
            if (id.equals(wagon.getId())) {
                PrintStream var10000 = System.out;
                String var10001 = wagon.getId();
                var10000.println("Id is:" + var10001 + "\nType of wagon: " + wagon.getType() + "\nMax capacity of wagon: " + wagon.getMaxCapacity() + "\n");
            }
        }

    }

    public void direction() {
        Iterator var1 = this.locomotives.iterator();

        while(var1.hasNext()) {
            Locomotive l = (Locomotive)var1.next();
            System.out.println("Direction: " + l.getDirection());
        }

    }

    public void toExit() {
        System.out.println("Exiting from system");
        System.exit(0);
    }

    public ArrayList<Locomotive> getLocomotives() {
        return this.locomotives;
    }

    public ArrayList<Plackart> getPlackarts() {
        return this.plackarts;
    }

    public ArrayList<Luxury> getLuxuries() {
        return this.luxuries;
    }

    public ArrayList<Freight> getFreights() {
        return this.freights;
    }

    public ArrayList<Wagon> getWagons() {
        return this.wagons;
    }
}

