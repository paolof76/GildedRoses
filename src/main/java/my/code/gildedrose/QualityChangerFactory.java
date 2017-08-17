package my.code.gildedrose;

class QualityChangerFactory {
	public QualityChanger createChanger(String name) {
		QualityChanger changer = null;
		if (name.equals(ItemNames.AGED_BRIE.getName())){
			changer = new AgedBrieChanger();
		}  else if (name.equals(ItemNames.BACKSTAGE.getName())){
			changer = new BackstageChanger();
		} else if (name.equals(ItemNames.SULFURAS.getName())) {
			changer = new SulfurasQualityChange();
		} else if (name.equals(ItemNames.CONJURED.getName())) {
			changer = new ConjuredChanger();
		} else {
			changer = new NormalProductChanger();
		}
		return changer;
	}
}