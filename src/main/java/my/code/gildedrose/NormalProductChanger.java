package my.code.gildedrose;

public class NormalProductChanger extends QualityChanger {
	public int change(int quality, int sellIn) {
		int calculatedQuality = 0;
		if (sellIn > 0) {
			calculatedQuality = quality - 1;
		} else {
			calculatedQuality = quality - 2;
		}
		return calculatedQuality;
	}
}