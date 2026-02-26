public class PetMachine {

    private static final int MAX_WATER = 30;
    private static final int MAX_SHAMPOO = 10;
    private static final int WATER_PER_BATH = 10;
    private static final int SHAMPOO_PER_BATH = 2;
    private static final int SUPPLY_STEP = 2;

    private boolean clean = true;
    private int water = MAX_WATER;
    private int shampoo = MAX_SHAMPOO;
    private Pet pet;

    public void takeAShower() {
        if (!hasPet()) {
            System.out.println("Coloque o pet na máquina para iniciar o banho.");
            return;
        }

        if (!clean) {
            System.out.println("A máquina está suja. Limpe antes de dar banho.");
            return;
        }

        if (!hasResourcesForBath()) {
            System.out.println("Não há água ou shampoo suficientes.");
            return;
        }

        water -= WATER_PER_BATH;
        shampoo -= SHAMPOO_PER_BATH;

        pet.setClean(true);
        clean = false;

        System.out.println("O pet " + pet.getName() + " está limpo.");
    }

    public void addWater() {
        if (water >= MAX_WATER) {
            System.out.println("A capacidade máxima de água foi atingida.");
            return;
        }

        water = Math.min(water + SUPPLY_STEP, MAX_WATER);
        System.out.println("Água adicionada. Nível atual: " + water);
    }

    public void addShampoo() {
        if (shampoo >= MAX_SHAMPOO) {
            System.out.println("A capacidade máxima de shampoo foi atingida.");
            return;
        }

        shampoo = Math.min(shampoo + SUPPLY_STEP, MAX_SHAMPOO);
        System.out.println("Shampoo adicionado. Nível atual: " + shampoo);
    }

    public void showWater() {
        System.out.println("Nível de água: " + water);
    }

    public void showShampoo() {
        System.out.println("Nível de shampoo: " + shampoo);
    }

    public void showPetStatus() {
        if (hasPet()) {
            System.out.println("O pet " + pet.getName() + " está na máquina.");
        } else {
            System.out.println("Não há pet na máquina.");
        }
    }

    public void setPet(Pet pet) {
        if (!clean) {
            System.out.println("A máquina está suja. Limpe antes de colocar o pet.");
            return;
        }

        if (hasPet()) {
            System.out.println("Já existe um pet na máquina.");
            return;
        }

        this.pet = pet;
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina.");
    }

    public void removePet() {
        if (!hasPet()) {
            System.out.println("Não há pet na máquina.");
            return;
        }

        clean = pet.isClean();
        System.out.println("O pet " + pet.getName() + " foi retirado.");
        pet = null;
    }

    public void wash() {
        if (hasPet()) {
            System.out.println("Retire o pet antes de limpar a máquina.");
            return;
        }

        clean = true;
        System.out.println("A máquina foi limpa.");
    }

    private boolean hasPet() {
        return pet != null;
    }

    private boolean hasResourcesForBath() {
        return water >= WATER_PER_BATH && shampoo >= SHAMPOO_PER_BATH;
    }
}
