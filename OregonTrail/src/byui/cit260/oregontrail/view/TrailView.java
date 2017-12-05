///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package byui.cit260.oregontrail.view;
//
///**
// *
// * @author Casey
// */
//public abstract class TrailView extends View {
//
//    int miles;
//    int milestogo;
//    String date;
//
//    public TrailView() {
//        super("\n******************************************************"
//                + "\n the date is"
//                + "\n You have traveled" + "and you have" + "to Go"
//                + "\n******************************************************"
//                + "\nWhat Do you want to do?"
//                + "\n C - Continue on the Trail"
//                + "\n U - Go Hunting"
//                + "\n G - Go Gather Food"
//                + "\n S - See Supplies"
//                + "\n R - Rest"
//                + "\n H - Help"
//                + "\n X - Exit Game");
//    }
//
//    @Override
//    public boolean doAction(String choice) {
//	choice = choice.toUpperCase();
//        switch (choice) {
//            case "C":
//                //this.TrailView(); + 1 day increment function
//                break;
//            case "U":
//                this.displayHuntingView();
//                break;
//            case "G":
//                //this.GatheringView();
//                break;
//            case "S":
//                this.displaySuppliesView();
//                break;
//            case "R":
//                //thistrailview + change party health + increment 1 day
//                break;
//            case "H":
//                this.displayHelpMenuView();
//                break;
//            case "X":
//                this.quitGame();
//            default:
//                this.console.println("\n*** Invalid selection *** Try again");
//                break;
//
//        }
//        return false;
//
//    }
//
//    private void displayHelpMenuView() {
//        HelpMenu Help = new HelpMenu();
//        Help.display();
//    }
//
//    private void displayHuntingView() {
//        HuntingView Hunting = new HuntingView();
//        Hunting.display();
//    }
//
//    private void displaySuppliesView() {
//        SuppliesView Supplies = new SuppliesView();
//        Supplies.display();
//    }
//
//    private void quitGame() {
//        return;
//    }
//
//}
