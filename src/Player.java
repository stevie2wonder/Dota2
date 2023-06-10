
class Player {
    String name;
    int toxicity;
    String nationality;
    String position;
    int experience;
    int gameUnderstanding;
    int mechanicsKnowledge;




    public Player(String name, int toxicity, String nationality, String position, int experience, int gameUnderstanding, int mechanicsKnowledge) {
        this.name = name;
        this.toxicity = toxicity;
        this.nationality = nationality;
        this.position = position;
        this.experience = experience;
        this.gameUnderstanding = gameUnderstanding;
        this.mechanicsKnowledge = mechanicsKnowledge;
    }

    @Override
    public String toString() {
        return name + ", " + nationality + ", " + position;
    }

}

