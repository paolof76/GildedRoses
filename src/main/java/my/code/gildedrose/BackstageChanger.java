package my.code.gildedrose;

public class BackstageChanger extends QualityChanger {
	@Override
	public int change(int quality, int sellIn) {
		int calculatedQuality = quality;
		if (calculatedQuality < 50) {
			if (sellIn >= 11) {
				calculatedQuality = quality + 1;
			} else if (sellIn > 6) {
				calculatedQuality = quality + 2;
			} else if (sellIn > 0) {
				calculatedQuality = quality + 3;
			} else {
				calculatedQuality = quality = 0;
			}
		}
		return calculatedQuality;
	}
}