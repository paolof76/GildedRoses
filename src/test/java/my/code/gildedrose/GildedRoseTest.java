package my.code.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

import my.code.gildedrose.GildedRose;
import my.code.gildedrose.Item;

public class GildedRoseTest {

    @Test
    public void testSulfuras() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 10, 80) };
        GildedRose app = new GildedRose(items);
        app.updateItems();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(80, app.items[0].quality);
    }
    
    @Test
    public void testDecreaseQualityVelocity1() {
        Item[] items = new Item[] { new Item("Normal stuff", 10, 50)};
        GildedRose app = new GildedRose(items);
        app.updateItems();
        assertEquals("Normal stuff", app.items[0].name);
        assertEquals(49, app.items[0].quality);
    }
    
    @Test
    public void testDecreaseQualityVelocity2() {
        Item[] items = new Item[] { new Item("Normal stuff", -10, 50)};
        GildedRose app = new GildedRose(items);
        app.updateItems();
        assertEquals("Normal stuff", app.items[0].name);
        assertEquals(48, app.items[0].quality);
    }
    @Test
    public void testDecreaseConjuredQualityVelocity1() {
    	Item[] items = new Item[] { new Item("Conjured Mana Cake", 10, 50)};
    	GildedRose app = new GildedRose(items);
    	app.updateItems();
    	assertEquals("Conjured Mana Cake", app.items[0].name);
    	assertEquals(48, app.items[0].quality);
    }
    
    @Test
    public void testDecreaseConjuredQualityVelocity2() {
        Item[] items = new Item[] { new Item("Conjured Mana Cake", -10, 50)};
        GildedRose app = new GildedRose(items);
        app.updateItems();
        assertEquals("Conjured Mana Cake", app.items[0].name);
        assertEquals(46, app.items[0].quality);
    }
    
    @Test
    public void testBackstageTicketsQualityStable() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 11, 50)};
        GildedRose app = new GildedRose(items);
        app.updateItems();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(50, app.items[0].quality);
    }
    
    @Test
    public void testBackstageTicketsQualityIncrease() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 20, 30)};
        GildedRose app = new GildedRose(items);
        app.updateItems();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(31, app.items[0].quality);
    }
    
    @Test
    public void testBackstageTicketsQualityIncrease2() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 30)};
        GildedRose app = new GildedRose(items);
        app.updateItems();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(32, app.items[0].quality);
    }
    
    @Test
    public void testBackstageTicketsQualityIncrease3() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 5, 30)};
        GildedRose app = new GildedRose(items);
        app.updateItems();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(33, app.items[0].quality);
    }
    
    @Test
    public void testBackstageTicketsQualityWhenSellInLtZero() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", -10, 30)};
        GildedRose app = new GildedRose(items);
        app.updateItems();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(0, app.items[0].quality);
    }
    
    @Test
    public void testAgedBrie() {
        Item[] items = new Item[] { new Item("Aged Brie", 10, 30)};
        GildedRose app = new GildedRose(items);
        app.updateItems();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(31, app.items[0].quality);
    }
    
    @Test
    public void testAgedBrieDouble() {
        Item[] items = new Item[] { new Item("Aged Brie", -10, 30)};
        GildedRose app = new GildedRose(items);
        app.updateItems();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(32, app.items[0].quality);
    }
    
    @Test
    public void testAgedBrieNoChange() {
        Item[] items = new Item[] { new Item("Aged Brie", -10, 60)};
        GildedRose app = new GildedRose(items);
        app.updateItems();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(60, app.items[0].quality);
    }

}