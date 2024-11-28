import java.util.ArrayList;
import java.util.List;

public class LevelManager {
	// ***************************
	// LevelManager 클래스
	// 레벨에 따라 필요한 데이터를 제공
	// 데이터베이스 역할
	// ***************************
	
	public LevelData getLevelData(String level) {
		// 레벨을 받아 해당 레벨에 필요한 데이터 제공
		// 레벨이 추가되면 이곳에 case 문으로 추가
		switch (level) {
		case "1":
			return createDataLevel1();
		case "2":
			return createDataLevel2();
		case "3":
			return createDataLevel3();
		}
		return null;
	}

	private LevelData createDataLevel1() {
		// 레벨1 데이터
		List<Item> itemTemplates = new ArrayList<>();

		itemTemplates.add(new Item("물티슈 뚜껑", "플라스틱", "images/items/plastic_water.png"));
		itemTemplates.add(new Item("배달음식 용기", "플라스틱", "images/items/plastic_squre.png"));
		itemTemplates.add(new Item("테이크아웃 컵", "플라스틱", "images/items/plastic_cup.png"));
		
		itemTemplates.add(new Item("유리병", "유리", "images/items/glassbottle_sink_none.png"));
		itemTemplates.add(new Item("유리컵", "유리", "images/items/glassbottle_cup.png"));

		itemTemplates.add(new Item("참치캔", "캔류", "images/items/can_dong.png"));
		itemTemplates.add(new Item("빈 스팸 캔", "캔류", "images/items/can_spam.png"));

		List<Bin> bins = new ArrayList<>();
		bins.add(new Bin("플라스틱", "images/bins/plastic_bin.png"));
		bins.add(new Bin("유리", "images/bins/glass_bin.png"));
		bins.add(new Bin("캔류", "images/bins/can_bin.png")); //캔으로 수정하기

		return new LevelData(1, itemTemplates, bins);
	}

	private LevelData createDataLevel2() {
		// 레벨2 데이터
		List<Item> itemTemplates = new ArrayList<>();

		itemTemplates.add(new Item("배달음식 용기", "플라스틱", "images/items/plastic_bowl.png"));
		itemTemplates.add(new Item("물티슈 뚜껑", "플라스틱", "images/items/plastic_water.png"));
		itemTemplates.add(new Item("배달음식 용기", "플라스틱", "images/items/plastic_squre.png"));
		
		itemTemplates.add(new Item("유리병", "유리", "images/items/glassbottle_sink_none.png"));
		itemTemplates.add(new Item("유리컵", "유리", "images/items/glassbottle_cup.png"));
		
		itemTemplates.add(new Item("종이", "종이", "images/items/paper.png"));
		itemTemplates.add(new Item("과자 상자", "종이", "images/items/snackbox.png"));
		itemTemplates.add(new Item("신문지", "종이", "images/items/paper_3.png"));
		
		itemTemplates.add(new Item("휴지", "일반", "images/items/tissue.png"));
		itemTemplates.add(new Item("프링글스 통", "일반", "images/items/pringles.png"));

		List<Bin> bins = new ArrayList<>();
		bins.add(new Bin("플라스틱", "images/bins/plastic_bin.png"));
		bins.add(new Bin("유리", "images/bins/glass_bin.png"));
		bins.add(new Bin("종이", "images/bins/paper_bin.png"));
		bins.add(new Bin("일반", "images/bins/regular_bin.png"));

		return new LevelData(2, itemTemplates, bins);
	}
	
	private LevelData createDataLevel3() {
		// 레벨3 데이터
		List<Item> itemTemplates = new ArrayList<>();

		itemTemplates.add(new Item("빈 페트병", "페트", "images/items/petbottle_none_cola.png"));
		
		itemTemplates.add(new Item("유리병", "유리", "images/items/glassbottle_sink_none.png"));
		
		itemTemplates.add(new Item("지퍼팩", "비닐", "images/items/vinyl.png"));
		itemTemplates.add(new Item("비닐봉지", "비닐", "images/items/vinyl_2.png"));
		
		itemTemplates.add(new Item("유리컵", "유리", "images/items/glassbottle_cup.png"));
		
		itemTemplates.add(new ComplexItem("라벨이 있는 페트병", "라벨이 있는 페트", "images/items/petbottle_cola_label.png", new Item("페트병", "페트", "images/items/petbottle_none_cola.png"), new Item("라벨", "비닐", "images/items/lable_vinyl.png"), "커터"));
		itemTemplates.add(new ComplexItem("음료수가 있는 유리병", "음료수가 있는 유리", "images/items/glassbottle_sink.png", new Item("빈 유리병", "유리", "images/items/glassbottle_sink_none.png"), "싱크대"));
		itemTemplates.add(new ComplexItem("음료수가 있는 페트병", "음료수가 있는 페트", "images/items/petbottle_sink.png", new Item("페트병", "페트", "images/items/petbottle_sink_none.png"), "싱크대"));
		
		List<Bin> bins = new ArrayList<>();
		bins.add(new Bin("페트", "images/bins/pet_bin.png"));
		bins.add(new Bin("유리", "images/bins/glass_bin.png"));
		bins.add(new Bin("비닐", "images/bins/vinyl_bin.png"));
		
		List<Tool> tools = new ArrayList<>();
		tools.add(new Tool("커터", "images/tools/커터.png"));
		tools.add(new Tool("싱크대", "images/tools/싱크대.png"));

		return new LevelData(3, itemTemplates, bins, tools);
	}
}