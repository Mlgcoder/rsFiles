public class textHandler {
	public void startText(int ID) {
client c = (client) server.playerHandler.players[ID];
if(PlayerHandler.portal1 == 1){
c.sendQuest("dead", 15895);
}
c.sendQuest("portal2", 15897);
if(PlayerHandler.portal2 == 1){
c.sendQuest("dead", 15897);
}
c.sendQuest("portal3", 15898);
if(PlayerHandler.portal3 == 1){
c.sendQuest("dead", 15898);
}
c.sendQuest("portal4", 15899);
if(PlayerHandler.portal4 == 1){
c.sendQuest("dead", 15899);
}
c.sendQuest("", 6570);
c.sendQuest("", 6572);
c.sendQuest("", 6664);
c.sendQuest("Project Guthix Highscores", 6399);
c.sendQuest("Project Guthix", 640);
c.sendQuest("Construction (Avaible)", 663);
c.sendQuest("", 7343);
c.sendQuest("", 7335);
c.sendQuest("", 7344);
c.sendQuest("", 7345);
c.sendQuest("", 7347);
c.sendQuest("", 7348);
c.sendQuest("@gre@Only build in con area", 7351); 
if(c.playerLevel[21] >= 1) {
c.sendQuest("@gre@North Wall (lvl 1)", 7332); 
c.sendQuest("Thank you for playing, ", 2449);
c.sendQuest(" Project Guthix", 2449);
                c.sendQuest("   Click below to Logout safely.", 2451);
                c.sendQuest("See you soon !", 2452);
}
if(c.playerLevel[21] < 1) {
c.sendQuest("North Wall (lvl 1)", 7332); 
}
if(c.playerLevel[21] >= 5){
c.sendQuest("@gre@South Wall (lvl 5)", 7333);
}
if(c.playerLevel[21] < 5) {
c.sendQuest("South Wall (lvl 5)", 7333);
}
if(c.playerLevel[21] >= 10) {
c.sendQuest("@gre@West wall (lvl 10)", 7334); 
}
if(c.playerLevel[21] < 10) {
c.sendQuest("West wall (lvl 10)", 7334);
}
if(c.playerLevel[21] >= 20) {
c.sendQuest("@gre@East Wall (lvl 20)", 7336); 
}
if(c.playerLevel[21] < 20) {
c.sendQuest("East Wall (lvl 20)", 7336);
}
if(c.playerLevel[21] >= 30) {
c.sendQuest("@gre@Dummy (level 30)", 7383);
}
if(c.playerLevel[21] < 30) {
c.sendQuest("Dummy (level 30)", 7383);
}
if(c.playerLevel[21] >= 45) {
c.sendQuest("@gre@Bank (lvl 45)", 7339); 
}
if(c.playerLevel[21] < 45) {
c.sendQuest("Bank (lvl 45)", 7339); 
}
if(c.playerLevel[21] >= 60) {
c.sendQuest("@gre@Red Lever (lvl 60)", 7339); 
}
if(c.playerLevel[21] < 60) {
c.sendQuest("Red Lever (lvl 60)", 7339); 
}
if(c.playerLevel[21] >= 65) {
c.sendQuest("@gre@Altar of flames (lvl 65)", 7356); 
}
if(c.playerLevel[21] < 65) {
c.sendQuest("Altar of flames (lvl 65)", 7356); 
}
if(c.playerLevel[21] >= 70) {
c.sendQuest("@gre@Big rock (lvl 70)", 7338); 
}
if(c.playerLevel[21] < 70) {
c.sendQuest("Big rock (lvl 70)", 7338); 
}
if(c.playerLevel[21] >= 80) {
c.sendQuest("@gre@Upward Staircase (lvl 80)", 7340); 
}
if(c.playerLevel[21] < 80) {
c.sendQuest("Upward Staircase (lvl 80)", 7340); 
}
if(c.playerLevel[21] >= 85) {
c.sendQuest("@gre@Downward Staircase (lvl 85)", 7346); 
}
if(c.playerLevel[21] < 85) {
c.sendQuest("Downward Staircase (lvl 85)", 7346); 
}
if(c.playerLevel[21] >= 90) {
c.sendQuest("@gre@Wardrobe (lvl 90)", 7341); 
}
if(c.playerLevel[21] < 90) {
c.sendQuest("Wardrobe (lvl 90)", 7341); 
}
if(c.playerLevel[21] >= 99) {
c.sendQuest("@gre@Fountain (lvl 99)", 7342); 
}
if(c.playerLevel[21] < 99) {
c.sendQuest("Fountain (lvl 99)", 7342); 
}
c.sendQuest("Please enter your PIN using the buttons below.", 14920);
c.sendQuest("First click the FIRST digit", 15313);
c.sendQuest("1", 14883);
c.sendQuest("2", 14884);
c.sendQuest("3", 14885);
c.sendQuest("4", 14886);
c.sendQuest("5", 14887);
c.sendQuest("6", 14888);
c.sendQuest("7", 14889);
c.sendQuest("8", 14890);
c.sendQuest("9", 14891);
c.sendQuest("0", 14892);
c.sendQuest("I don't know it.", 14921);
c.sendQuest("Exit", 14922);
c.sendQuest("", 15075);
c.sendQuest("", 15076);
c.sendQuest("", 15176);
c.sendQuest("", 15171);
c.sendQuest("", 15079);
c.sendQuest("", 15080);
if(c.bankPin != -1){
    c.sendQuest("@gre@Set", 15105);
}
if(c.bankPin == -1){
    c.sendQuest("@red@NONE", 15105);
}
c.sendFrame126("The Bank of Runescape - Deposit Box", 7421);
c.sendQuest("The Bank of Runescape - Bank Pin", 14923);
c.sendQuest("", 15107);
c.sendQuest("Set Pin", 15078);
c.sendQuest("Delete Pin", 15082);
c.sendQuest("", 15107);
c.sendQuest("Set Pin", 15078);
c.sendQuest("The Bank of Runescape",5383);
c.sendQuest("",4439);
c.sendQuest("Pest control", 10361);
c.sendQuest("Current points:", 10378);
c.sendQuest("Cash Reward", 10374);
c.sendQuest("Void Knight", 10375);
c.sendQuest("25 Points", 10376);
c.sendQuest("200 Points", 10377);
c.sendQuest("Strange Item", 6557);
c.sendQuest("100 Points", 6559);
c.sendQuest("God's Gift", 16159);
c.sendQuest("25 Points", 16160);
c.sendQuest("Close Window", 15949);//Close Text
c.sendQuest("      Project Guthix", 15950);//Title
c.sendQuest("", 15960);//Under Title
c.sendQuest("", 15959);//Beside ^
c.sendQuest("", 15961);//Beside ^
c.sendQuest("Client [V1]: Forums, Server chat section", 15951);//Bottom banner- top line
c.sendQuest("", 15955);//top line
c.sendQuest("", 15953);//top line
c.sendQuest("", 15958);//top line
c.sendQuest("??? is the forums!", 15952);//Bottom banner- bottom line
c.sendQuest("         Latest update: Full magic", 15956);//bottom line
c.sendQuest("", 15954);//bottom line
c.sendQuest("", 15957);//bottom line
c.sendQuest("Minigame Teleports", 7457);
c.sendQuest("Teleports", 7458);
    c.sendQuest("Minigame Teleports", 13089);
    c.sendQuest("Teleports", 13090);
    c.sendQuest("@gre@0/0", 13093);
    c.sendQuest("@gre@0/0", 13094);

    c.sendQuest("Runecrafting", 16251);
    c.sendQuest("Orbs to points", 1259);
    c.sendQuest("Changes held orbs into points", 1260);
    c.sendQuest("Orbs to more points", 15879);
    c.sendQuest("Changes held orbs into more points", 15880);
    c.sendQuest("Home", 1300);
    c.sendQuest("Teleport home", 1301);
    c.sendQuest("Home", 13037);
    c.sendQuest("Teleport home", 13038);
    c.sendQuest("@gre@0/0", 13042);
    c.sendQuest("@gre@0/0", 13043);
    c.sendQuest("@gre@0/0", 13044);
    c.sendQuest("Pking", 1325);
    c.sendQuest("Pk here", 1326);
    c.sendQuest("Pking", 13047);
    c.sendQuest("Pk here", 13048);
    c.sendQuest("@gre@0/0", 13051);
    c.sendQuest("@gre@0/0", 13052);
    c.sendQuest("Beginning training", 1350);
    c.sendQuest("Begin your adventure here", 1351);
    c.sendQuest("Beginning training", 13055);
    c.sendQuest("Begin your adventure here", 13056);
    c.sendQuest("@gre@0/0", 13059);
    c.sendQuest("@gre@0/0", 13060);
    c.sendQuest("Catherby", 1382);
    c.sendQuest("Train non-combat skills there", 1383);
    c.sendQuest("Catherby", 13063);
    c.sendQuest("Train non-combat skills there", 13064);
    c.sendQuest("@gre@0/0", 13067);
    c.sendQuest("@gre@0/0", 13068);
    c.sendQuest("Monster tele", 1415);
    c.sendQuest("Battle different monsters", 1416);
    c.sendQuest("Monster tele", 13071);
    c.sendQuest("Battle different monsters", 13072);
    c.sendQuest("@gre@0/0", 13076);
    c.sendQuest("@gre@0/0", 13077);
    c.sendQuest("@gre@0/0", 13078);
    c.sendQuest("Minigame tele", 1454);
    c.sendQuest("Try out minigames", 1455);
    c.sendQuest("Minigame tele", 13081);
    c.sendQuest("Try out minigames", 13082);
    c.sendQuest("@gre@0/0", 13085);
    c.sendQuest("@gre@0/0", 13086);
    c.sendQuest("", 4297);
    c.sendQuest("", 4298);
    c.sendQuest("", 4299);
    c.sendQuest("", 4300);
    c.sendQuest("", 4301);
    c.sendQuest("", 4302);
    c.sendQuest("", 4303);
    c.sendQuest("", 4304);
    c.sendQuest("", 14872);
    c.sendQuest("", 664);
    c.sendQuest("", 8971);
    c.sendFrame126("", 6570);
    c.sendFrame126("", 6572);
    c.sendFrame126("", 6664);
		c.sendQuest("Using this will send a notification to all online mods",
				5967);
		c.sendQuest(
				"@yel@Then click below to indicate which of our rules is being broken.",
				5969);
		c.sendQuest("4: Bug abuse (includes noclip)", 5974);
		c.sendQuest("5: staff impersonation", 5975);
		c.sendQuest("6: Monster luring or abuse", 5976);
		c.sendQuest("8: Item Duplication", 5978);
		c.sendQuest("10: X logging", 5980);
		c.sendQuest("12: Possible duped items", 5982);
	}
} // ends textHandler