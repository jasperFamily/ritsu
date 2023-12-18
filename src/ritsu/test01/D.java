package ritsu.test01;
public void   saveHeroToFile(Hero h) throws IOException {
	Writer w =     new  BufferedWriter(new FileWriter("rpgsave.dat"));
	w.wite(h.name + "yn");
	w.write(h.hp + "yn");
	w.write(h.mp + "yn" );
	w.flush();
	w.close();
	
}
public class D {

}
