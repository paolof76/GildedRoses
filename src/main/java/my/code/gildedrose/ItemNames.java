package my.code.gildedrose;

public enum ItemNames {
	AGED_BRIE("Aged Brie"),
	BACKSTAGE("Backstage passes to a TAFKAL80ETC concert"),
	SULFURAS("Sulfuras, Hand of Ragnaros"),
	CONJURED("Conjured Mana Cake"),
	PRODUCT("Something");
	
	private String name; //name of product
	
	ItemNames(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
