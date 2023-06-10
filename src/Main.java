import javafx.application.Application;
import javafx.collections.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.*;
import javafx.util.Callback;
import javafx.scene.paint.Color;

import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class Main extends Application {
    private List<Player> players = new ArrayList<>();
    private List<Player> team = new ArrayList<>();
    private TextArea textArea;


    @Override
    public void start(Stage primaryStage) {
        {


            primaryStage.setTitle("My Application");
            primaryStage.getIcons().add(new Image("file:icon.png"));
            primaryStage.setScene(new Scene(new Label("Hello World!")));
            primaryStage.show();



            VBox root = new VBox();

            MenuBar menuBar = new MenuBar();
            Menu menu = new Menu("Menu");
            MenuItem startGame = new MenuItem("Start game");
            MenuItem settings = new MenuItem("Settings");
            MenuItem info = new MenuItem("Info");

            menu.getItems().addAll(startGame, settings, info);
            menuBar.getMenus().add(menu);
            root.getChildren().add(menuBar);


            startGame.setOnAction(event -> {
                // код для запуска игры
            });

            settings.setOnAction(event -> {
                showSettings();
            });


            info.setOnAction(event -> {
                // код для отображения информации
            });

            Scene scene = new Scene(root, 400, 300);
            primaryStage.setScene(scene);
            primaryStage.setTitle("My Application");
            primaryStage.show();
        }



        players.add(new Player("Fng", 6, "Russia", "Support", 9, 9, 9));
        players.add(new Player("IllidanSTR", 4, "Russia", "Carry", 8, 8, 8));
        players.add(new Player("Alohadance", 3, "Russia", "Support", 8, 8, 8));
        players.add(new Player("Gambit", 5, "Russia", "Support", 9, 9, 9));
        players.add(new Player("AfterLife", 2, "Ukraine", "Offlane", 8, 8, 8));
        players.add(new Player("Chappie", 1, "Russia", "Carry/Mid", 8, 8, 8));
        players.add(new Player("Crystallize", 1, "Ukraine", "Carry", 9, 9, 9));
        players.add(new Player("Goblak", 4, "Russia", "Support", 9, 9, 9));
        players.add(new Player("Lil", 5, "Russia", "Support", 9, 9, 9));
        players.add(new Player("RAMZES666", 5, "Russia", "Support", 8, 8, 8));
        players.add(new Player("RodjER", 4, "Armenia", "Support", 9, 9, 9));
        players.add(new Player("Silent", 3, "Russia", "Offlane", 8, 8, 8));
        players.add(new Player("SoNNeikO", 4, "Ukraine", "Support", 10, 10, 10));
        players.add(new Player("DkPhobos", 2, "Russia", "Offlane", 9, 9, 9));
        players.add(new Player("G", 3, "Russia", "Mid", 8, 8, 8));
        players.add(new Player("Lil_me_alone", 4, "Russia", "Support", 9, 9, 9));
        players.add(new Player("NoFear", 5, "Russia", "Support", 6, 5, 5));
        players.add(new Player("Shachlo", 2, "Russia", "Offlane", 6, 6, 6));
        players.add(new Player("Sedoy", 1, "Russia", "Mid", 5, 7, 6));
        players.add(new Player("Bignum", 5, "Russia", "Support", 4, 5, 5));
        players.add(new Player("Dendi", 2, "Ukraine", "Mid", 9, 9, 9));
        players.add(new Player("Ghostik", 2, "Russia", "Offlane", 5, 8, 8));
        players.add(new Player("Mag~", 2, "Russia", "Offlane", 5, 5, 5));
        players.add(new Player("Resolut1on", 1, "Ukraine", "Carry", 8, 9, 9));
        players.add(new Player("RodjER", 4, "Armenia", "Support", 7, 8, 8));
        players.add(new Player("VANSKOR", 5, "Ukraine", "Support", 7, 7, 8));
        players.add(new Player("Iceberg", 2, "Ukraine", "Mid", 7, 6, 7));
        players.add(new Player("KingR", 5, "Russia", "Support", 7, 7, 6));
        players.add(new Player("Miracle-", 1, "Jordan", "Mid", 10, 10, 10));
        players.add(new Player("Mind_Control", 3, "Germany", "Offlane", 8, 7, 9));
        players.add(new Player("GH", 4, "Jordan", "Support", 9, 9, 9));
        players.add(new Player("KuroKy", 5, "Germany", "Support", 9, 8, 9));
        players.add(new Player("Matumbaman", 1, "Finland", "Carry", 9, 9, 9));
        players.add(new Player("N0tail", 5, "Denmark", "Captain", 8, 8, 7));
        players.add(new Player("Puppey", 5, "Estonia", "Support", 8, 8, 8));
        players.add(new Player("s4", 2, "Sweden", "Offlane", 9, 9, 9));
        players.add(new Player("SumaiL", 2, "Pakistan", "Mid", 10, 10, 10));
        players.add(new Player("UNiVeRsE", 3, "USA", "Offlane", 9, 9, 9));
        players.add(new Player("Zai", 4, "Sweden", "Support/Offlane", 9, 9, 9));
        players.add(new Player("Arteezy", 1, "Canada", "Carry", 10, 10, 10));
        players.add(new Player("Cr1t-", 4, "Denmark", "Support/Captain", 9, 9, 9));
        players.add(new Player("Fly", 5, "Israel", "Support/Captain", 9, 9, 9));
        players.add(new Player("JerAx", 4, "Finland", "Support", 10, 10, 10));
        players.add(new Player("Matumbaman", 1, "Finland", "Carry", 9, 9, 9));
        players.add(new Player("MidOne", 2, "Malaysia", "Mid", 9, 9, 9));
        players.add(new Player("MoonMeander", 3, "Canada", "Offlane", 8, 8, 8));
        players.add(new Player("Nisha", 1, "Poland", "Carry/Mid", 9, 9, 9));
        players.add(new Player("PashaBiceps", 3, "Poland", "Offlane", 9, 9, 9));
        players.add(new Player("Rtz", 1, "USA", "Carry/Mid", 10, 10, 10));
        players.add(new Player("Sccc", 2, "China", "Mid", 9, 9, 9));
        players.add(new Player("Somnus丶M", 2, "China", "Mid", 10, 10, 10));
        players.add(new Player("XNova", 5, "China", "Support", 9, 9, 9));
        players.add(new Player("Yang", 3, "China", "Offlane", 9, 9, 9));
        players.add(new Player("y`", 1, "China", "Carry", 9, 9, 9));
        players.add(new Player("Abed", 2, "Philippines", "Mid", 9, 9, 9));
        players.add(new Player("DJ", 4, "Philippines", "Support", 9, 9, 9));
        players.add(new Player("iceiceice", 3, "Singapore", "Offlane", 9, 9, 9));
        players.add(new Player("Jabz", 4, "Malaysia", "Support", 9, 9, 9));
        players.add(new Player("kpii", 3, "Australia", "Offlane", 9, 9, 9));
        players.add(new Player("Kuku", 2, "Philippines", "Mid", 8, 8, 8));
        players.add(new Player("March", 5, "South Korea", "Support/Captain", 8, 8, 8));



        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(5);
        gridPane.setVgap(10);
        gridPane.setStyle("-fx-background-color: #ffffff;");
// добавление элементов в gridPane



        primaryStage.show();


        ListView<Player> listView = new ListView<>();
        ObservableList<Player> items = FXCollections.observableArrayList(players);
        listView.setItems(items);
        gridPane.add(listView, 0, 1, 3, 1);
        listView.setStyle("-fx-control-inner-background: #e1dede;");
        listView.setCellFactory(new Callback<ListView<Player>, ListCell<Player>>() {
            @Override
            public ListCell<Player> call(ListView<Player> param) {
                return new ListCell<Player>() {
                    private ImageView imageView = new ImageView();

                    @Override
                    protected void updateItem(Player item, boolean empty) {
                        super.updateItem(item, empty);
                        if (empty || item == null) {
                            setText(null);
                            setGraphic(null);
                        } else {
                            setText(item.name + ", " + item.nationality + ", " + item.position);
                            Image image = new Image("file:flags/" + item.nationality + ".png");
                            imageView.setImage(image);
                            setGraphic(imageView);
                        }
                    }
                };
            }
        });

        ListView<Player> teamListView = new ListView<>();

        teamListView.setStyle("-fx-control-inner-background: #e1dede;");
        ObservableList<Player> teamItems = FXCollections.observableArrayList(team);
        teamListView.setItems(teamItems);
        gridPane.add(teamListView, 0, 4, 3, 1);
        Label teamCountLabel = new Label("Team count: " + team.size() + " / 5");
        gridPane.add(teamCountLabel, 2, 3);

        Button removeButton = new Button("Remove from team");
        removeButton.setOnAction(event -> {
            Player selectedPlayer = teamListView.getSelectionModel().getSelectedItem();

            if (selectedPlayer != null) {
                team.remove(selectedPlayer);
                teamItems.remove(selectedPlayer);
                items.add(selectedPlayer);
                teamCountLabel.setText("Team count: " + team.size() + " / 5");
            }
        });
        gridPane.add(removeButton, 1, 3);

        Button addButton = new Button("Add to team");
        addButton.setOnAction(event -> {
            Player selectedPlayer = listView.getSelectionModel().getSelectedItem();
            if (selectedPlayer != null) {
                team.add(selectedPlayer);
                items.remove(selectedPlayer);
            }
        });
        gridPane.add(addButton, 0, 3);

        addButton.setOnAction(event -> {
            Player selectedPlayer = listView.getSelectionModel().getSelectedItem();
            if (selectedPlayer != null && team.size() < 5) {
                team.add(selectedPlayer);
                items.remove(selectedPlayer);
                teamItems.add(selectedPlayer);
                teamCountLabel.setText("Team count: " + team.size() + " / 5");
            }
        });

        TextField searchField = new TextField();
        Button searchButton = new Button("Search");
        searchButton.setOnAction(event -> {
            String searchText = searchField.getText();

            List<Player> filteredPlayers = players.stream()
                    .filter(player -> player.name.toLowerCase().contains(searchText)
                        ||  player.nationality.toLowerCase().contains(searchText)
                        ||  player.position.toLowerCase().contains(searchText))
                    .collect(Collectors.toList());

            ObservableList<Player> itemsf = FXCollections.observableArrayList(filteredPlayers);
            listView.setItems(itemsf);
        });
        gridPane.add(searchField, 0, 0);
        gridPane.add(searchButton, 1, 0);


        Label label = new Label("Select an action:");
        gridPane.add(label, 3, 0);

        ObservableList<String> options =
                FXCollections.observableArrayList(
                        "Select random team",
                        "Show team info",
                        "Calculate chance of winning",
                        "Compare individual players"
                );
        ComboBox<String> comboBox = new ComboBox<>(options);
        comboBox.getSelectionModel().selectFirst();
        gridPane.add(comboBox, 4, 0);
        Button button = new Button("Run");
        button.setOnAction(event -> {
            String selectedAction = comboBox.getSelectionModel().getSelectedItem();
            if (selectedAction.equals("Select random team")) {
                selectRandomTeam();
            } else if (selectedAction.equals("Show team info")) {
                showTeamInfo();
            } else if (selectedAction.equals("Calculate chance of winning")) {
                calculateChanceOfWinning();
            } else if (selectedAction.equals("Compare individual players")) {
                compareIndividualPlayers();
            }
        });
        gridPane.add(button, 5, 0);


        textArea = new TextArea();
        textArea.setPrefHeight(200);
        textArea.setEditable(false);
        gridPane.add(textArea, 3, 1, 3, 1);
        textArea.setStyle("-fx-control-inner-background: #e1dede;");
        Scene scene = new Scene(gridPane);
        scene.setFill(Color.RED);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Dota 2 Team Selector");
        primaryStage.show();
    }

    private void showSettings() {
    }

    private void showTeamInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Selected team:\n");
        for (Player player : team) {
            sb.append(player).append("\n");
        }
        textArea.setText(sb.toString());
    }

    private void compareIndividualPlayers() {
        StringBuilder sb = new StringBuilder();
        sb.append("Сравнение игроков:\n");
        for (int i = 0; i < team.size() - 1; i++) {
            for (int j = i + 1; j < team.size(); j++) {
                Player player1 = team.get(i);
                Player player2 = team.get(j);
                int toxicDiff = player1.toxicity - player2.toxicity;
                sb.append(player1.name).append(" против ").append(player2.name).append(":\n");
                if (toxicDiff > 0) {
                    sb.append(player1.name).append(" более токсичен, чем ").append(player2.name).append("\n");
                } else if (toxicDiff < 0) {
                    sb.append(player2.name).append(" более токсичен, чем ").append(player1.name).append("\n");
                } else {
                    sb.append("Токсичность игроков равна\n");
                }
                int expDiff = player1.experience - player2.experience;
                if (expDiff > 0) {
                    sb.append(player1.name).append(" имеет больший опыт, чем ").append(player2.name).append("\n");
                } else if (expDiff < 0) {
                    sb.append(player2.name).append(" имеет больший опыт, чем ").append(player1.name).append("\n");
                } else {
                    sb.append("Опыт игроков равен\n");
                }
                int understandDiff = player1.gameUnderstanding - player2.gameUnderstanding;
                if (understandDiff > 0) {
                    sb.append(player1.name).append(" лучше понимает игру, чем ").append(player2.name).append("\n");
                } else if (understandDiff < 0) {
                    sb.append(player2.name).append(" лучше понимает игру, чем ").append(player1.name).append("\n");
                } else {
                    sb.append("Понимание игроков равно\n");
                }
                int mechanicDiff = player1.mechanicsKnowledge - player2.mechanicsKnowledge;
                if (mechanicDiff > 0) {
                    sb.append(player1.name).append(" лучше знает игровые механики, чем ").append(player2.name).append("\n");
                } else if (mechanicDiff < 0) {
                    sb.append(player2.name).append(" лучше знает игровые механики, чем ").append(player1.name).append("\n");
                } else {
                    sb.append("Знание игровых механик равно\n");
                }
                sb.append("\n");
            }
        }
        textArea.setText(sb.toString());
    }

    private void calculateChanceOfWinning() {
        double sumExperience = 0;
        double sumGameUnderstanding = 0;
        double sumMechanicsKnowledge = 0;
        double sumToxicity = 0;

        for (Player player : team) {
            sumExperience += player.experience;
            sumGameUnderstanding += player.gameUnderstanding;
            sumMechanicsKnowledge += player.mechanicsKnowledge;
        }

        double avgExperience = sumExperience / team.size();
        double avgGameUnderstanding = sumGameUnderstanding / team.size();
        double avgMechanicsKnowledge = sumMechanicsKnowledge / team.size();
        double avgToxicity = sumToxicity / team.size();

        double chanceOfWinning = (avgExperience  + avgGameUnderstanding  + avgMechanicsKnowledge  - avgToxicity  )  / 30.0 * 100.0 ;
        textArea.setText("Chance of winning: " + chanceOfWinning);
    }


    private void selectRandomTeam() {
        Random rand = new Random();
        team.clear();
        for (int i = 0; i < 5; i++) {
            int randomIndex = rand.nextInt(players.size());
            Player randomPlayer = players.get(randomIndex);
            team.add(randomPlayer);
            players.remove(randomIndex);
        }
    }
}
