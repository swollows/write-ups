package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

public final class TabLayoutMediator {
    private RecyclerView.Adapter<?> adapter;
    private boolean attached;
    private final boolean autoRefresh;
    private TabLayoutOnPageChangeCallback onPageChangeCallback;
    private TabLayout.OnTabSelectedListener onTabSelectedListener;
    private RecyclerView.AdapterDataObserver pagerAdapterObserver;
    private final boolean smoothScroll;
    private final TabConfigurationStrategy tabConfigurationStrategy;
    private final TabLayout tabLayout;
    private final ViewPager2 viewPager;

    public interface TabConfigurationStrategy {
        void onConfigureTab(TabLayout.Tab tab, int i);
    }

    public TabLayoutMediator(TabLayout tabLayout2, ViewPager2 viewPager2, TabConfigurationStrategy tabConfigurationStrategy2) {
        this(tabLayout2, viewPager2, true, tabConfigurationStrategy2);
    }

    public TabLayoutMediator(TabLayout tabLayout2, ViewPager2 viewPager2, boolean autoRefresh2, TabConfigurationStrategy tabConfigurationStrategy2) {
        this(tabLayout2, viewPager2, autoRefresh2, true, tabConfigurationStrategy2);
    }

    public TabLayoutMediator(TabLayout tabLayout2, ViewPager2 viewPager2, boolean autoRefresh2, boolean smoothScroll2, TabConfigurationStrategy tabConfigurationStrategy2) {
        this.tabLayout = tabLayout2;
        this.viewPager = viewPager2;
        this.autoRefresh = autoRefresh2;
        this.smoothScroll = smoothScroll2;
        this.tabConfigurationStrategy = tabConfigurationStrategy2;
    }

    public void attach() {
        if (!this.attached) {
            this.adapter = this.viewPager.getAdapter();
            if (this.adapter != null) {
                this.attached = true;
                this.onPageChangeCallback = new TabLayoutOnPageChangeCallback(this.tabLayout);
                this.viewPager.registerOnPageChangeCallback(this.onPageChangeCallback);
                this.onTabSelectedListener = new ViewPagerOnTabSelectedListener(this.viewPager, this.smoothScroll);
                this.tabLayout.addOnTabSelectedListener(this.onTabSelectedListener);
                if (this.autoRefresh) {
                    this.pagerAdapterObserver = new PagerAdapterObserver();
                    this.adapter.registerAdapterDataObserver(this.pagerAdapterObserver);
                }
                populateTabsFromPagerAdapter();
                this.tabLayout.setScrollPosition(this.viewPager.getCurrentItem(), 0.0f, true);
                return;
            }
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw new IllegalStateException("TabLayoutMediator is already attached");
    }

    public void detach() {
        if (this.autoRefresh && this.adapter != null) {
            this.adapter.unregisterAdapterDataObserver(this.pagerAdapterObserver);
            this.pagerAdapterObserver = null;
        }
        this.tabLayout.removeOnTabSelectedListener(this.onTabSelectedListener);
        this.viewPager.unregisterOnPageChangeCallback(this.onPageChangeCallback);
        this.onTabSelectedListener = null;
        this.onPageChangeCallback = null;
        this.adapter = null;
        this.attached = false;
    }

    public boolean isAttached() {
        return this.attached;
    }

    /* access modifiers changed from: package-private */
    public void populateTabsFromPagerAdapter() {
        int currItem;
        this.tabLayout.removeAllTabs();
        if (this.adapter != null) {
            int adapterCount = this.adapter.getItemCount();
            for (int i = 0; i < adapterCount; i++) {
                TabLayout.Tab tab = this.tabLayout.newTab();
                this.tabConfigurationStrategy.onConfigureTab(tab, i);
                this.tabLayout.addTab(tab, false);
            }
            if (adapterCount > 0 && (currItem = Math.min(this.viewPager.getCurrentItem(), this.tabLayout.getTabCount() - 1)) != this.tabLayout.getSelectedTabPosition()) {
                this.tabLayout.selectTab(this.tabLayout.getTabAt(currItem));
            }
        }
    }

    private static class TabLayoutOnPageChangeCallback extends ViewPager2.OnPageChangeCallback {
        private int previousScrollState;
        private int scrollState;
        private final WeakReference<TabLayout> tabLayoutRef;

        TabLayoutOnPageChangeCallback(TabLayout tabLayout) {
            this.tabLayoutRef = new WeakReference<>(tabLayout);
            reset();
        }

        public void onPageScrollStateChanged(int state) {
            this.previousScrollState = this.scrollState;
            this.scrollState = state;
            TabLayout tabLayout = (TabLayout) this.tabLayoutRef.get();
            if (tabLayout != null) {
                tabLayout.updateViewPagerScrollState(this.scrollState);
            }
        }

        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            TabLayout tabLayout = (TabLayout) this.tabLayoutRef.get();
            if (tabLayout != null) {
                boolean updateIndicator = true;
                boolean updateSelectedTabView = this.scrollState != 2 || this.previousScrollState == 1;
                if (this.scrollState == 2 && this.previousScrollState == 0) {
                    updateIndicator = false;
                }
                tabLayout.setScrollPosition(position, positionOffset, updateSelectedTabView, updateIndicator, false);
            }
        }

        public void onPageSelected(int position) {
            TabLayout tabLayout = (TabLayout) this.tabLayoutRef.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != position && position < tabLayout.getTabCount()) {
                tabLayout.selectTab(tabLayout.getTabAt(position), this.scrollState == 0 || (this.scrollState == 2 && this.previousScrollState == 0));
            }
        }

        /* access modifiers changed from: package-private */
        public void reset() {
            this.scrollState = 0;
            this.previousScrollState = 0;
        }
    }

    private static class ViewPagerOnTabSelectedListener implements TabLayout.OnTabSelectedListener {
        private final boolean smoothScroll;
        private final ViewPager2 viewPager;

        ViewPagerOnTabSelectedListener(ViewPager2 viewPager2, boolean smoothScroll2) {
            this.viewPager = viewPager2;
            this.smoothScroll = smoothScroll2;
        }

        public void onTabSelected(TabLayout.Tab tab) {
            this.viewPager.setCurrentItem(tab.getPosition(), this.smoothScroll);
        }

        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public void onTabReselected(TabLayout.Tab tab) {
        }
    }

    private class PagerAdapterObserver extends RecyclerView.AdapterDataObserver {
        PagerAdapterObserver() {
        }

        public void onChanged() {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        public void onItemRangeChanged(int positionStart, int itemCount) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        public void onItemRangeChanged(int positionStart, int itemCount, Object payload) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        public void onItemRangeInserted(int positionStart, int itemCount) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        public void onItemRangeRemoved(int positionStart, int itemCount) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        public void onItemRangeMoved(int fromPosition, int toPosition, int itemCount) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }
    }
}
