package de.home.wallpaperdeamon.control;

import de.home.wallpaperdeamon.DesktopManager;
import de.home.wallpaperdeamon.util.Constants;
import de.home.wallpaperdeamon.view.TrayView;
import de.home.wallpaperdeamon.widgets.PathChooserWidget;

public class TrayActivity implements TrayView.Presenter {

   private final DesktopManager desktopManager;

   public TrayActivity(final TrayView view) {
      this.view = view;
      desktopManager = new DesktopManager("/Users/cbl/Documents/wallpaper");
   }

   @Override
   public void onChoosePathSelected(final String path) {
      final PathChooserWidget pathChooserWidget = new PathChooserWidget();
      pathChooserWidget.getOfflineResource();
   }

   @Override
   public String getCurrentFolderPath() {
      return Constants.TRAY_ICON_PATH;
   }

   @Override
   public void start() {
      desktopManager.rand();
   }

   @Override
   public void next() {
      desktopManager.next();
   }

   private TrayView view;
}
