package my.code.gildedrose;

public class AgedBrieChanger extends QualityChanger {
	@Override
	public int change(int quality, int sellIn) {
		int calculatedQuality = quality;
		if (calculatedQuality < 50) {
			if (sellIn > 0) {
				calculatedQuality = quality + 1;
			} else {
				calculatedQuality = quality + 2;
			}
		}
		return calculatedQuality;
	}
}