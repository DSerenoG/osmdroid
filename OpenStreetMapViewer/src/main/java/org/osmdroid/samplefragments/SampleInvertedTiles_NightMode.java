package org.osmdroid.samplefragments;

/**
 * sample fragment to show invert tiles, aka night mode
 * @author alex
 */
public class SampleInvertedTiles_NightMode extends BaseSampleFragment {

     @Override
     public String getSampleTitle() {
          return "Inverted Tiles";
     }
     
     @Override
     public void addOverlays() {
		this.mMapView.getController().setInvertedTiles(true);
	}
     
}
