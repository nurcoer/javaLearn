import java.sql.Date;

import Adapter.MernisServiceAdapters;
import Business.Concrete.GamerManager;
import Business.Concrete.SalesGameManager;
import DataAccess.Concrete.GamerDao;
import DataAccess.Concrete.SalesGameDao;
import Entities.Concrete.Campaing;
import Entities.Concrete.Game;
import Entities.Concrete.Gamer;
import Entities.Concrete.SalesGame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game csGo = new Game("CsGo","Fps oyunu",100);
		Game valorant = new Game("Valorant","Fps oyunu",200);
		
		Gamer nur = new Gamer("nur","cöer","11122233344",new Date(1997, 10, 26));
		
		GamerManager gamer1 = new GamerManager(new GamerDao(),new MernisServiceAdapters());
		gamer1.add(nur);
		
		Campaing blackFriday = new Campaing("BlackFriday",10);
		
		//Satýþ Ýþlemleri:
		SalesGame satis1Object =new SalesGame(nur, valorant, blackFriday);
		SalesGameManager satis1= new SalesGameManager(new SalesGameDao());
		satis1.add(satis1Object);
		
	}

}
