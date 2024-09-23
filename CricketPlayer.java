class CricketPlayer extends Player {

    @Override
    public void play() {
        System.out.println(name + " is playing cricket.");
    }

    public static void main(String[] args) {
        CricketPlayer player = new CricketPlayer(); // This will call the constructor and take input
        player.displayInfo();  // This will display the player information
        player.play();         // This will execute the play method
    }
}
