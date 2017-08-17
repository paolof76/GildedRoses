package my.code.gildedrose;

public class ConjuredChanger extends NormalProductChanger {
	@Override
	public int change(int quality, int sellIn) {
		int calcQuality = super.change(quality, sellIn);
		calcQuality = super.change(calcQuality, sellIn);
		return calcQuality;
	}
}
