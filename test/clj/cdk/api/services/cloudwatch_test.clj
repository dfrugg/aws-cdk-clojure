(ns cdk.api.services.cloudwatch-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.cloudwatch package. "
  (:require [clojure.test :refer [deftest
                                  is
                                  testing]]
            [cdk.api.services.cloudwatch :refer [alarm-state
                                                 alarm-status-widget-sort-by
                                                 comparison-operator
                                                 graph-widget-view
                                                 legend-position
                                                 log-query-visualization-type
                                                 period-override
                                                 shading
                                                 table-layout
                                                 table-summary-column
                                                 text-widget-background
                                                 treat-missing-data
                                                 unit
                                                 variable-input-type
                                                 variable-type
                                                 vertical-shading]])
  (:import [software.amazon.awscdk.services.cloudwatch AlarmState
                                                       AlarmStatusWidgetSortBy
                                                       ComparisonOperator
                                                       GraphWidgetView
                                                       LegendPosition
                                                       LogQueryVisualizationType
                                                       PeriodOverride
                                                       Shading
                                                       TableLayout
                                                       TableSummaryColumn
                                                       TextWidgetBackground
                                                       TreatMissingData
                                                       Unit
                                                       VariableInputType
                                                       VariableType
                                                       VerticalShading]))


(deftest alarm-state-test
  (testing "Testing enum function alarm-state"
    (is (= AlarmState/OK (alarm-state {:item AlarmState/OK} "test" :item)))
    (is (= AlarmState/OK (alarm-state {:test/item AlarmState/OK} "test" :item)))
    (is (= AlarmState/INSUFFICIENT_DATA (alarm-state {:item AlarmState/INSUFFICIENT_DATA} "test" :item)))
    (is (= AlarmState/INSUFFICIENT_DATA (alarm-state {:test/item AlarmState/INSUFFICIENT_DATA} "test" :item)))
    (is (= AlarmState/ALARM (alarm-state {:item AlarmState/ALARM} "test" :item)))
    (is (= AlarmState/ALARM (alarm-state {:test/item AlarmState/ALARM} "test" :item)))
    (is (= AlarmState/OK (alarm-state {:item :ok} "test" :item)))
    (is (= AlarmState/OK (alarm-state {:test/item :ok} "test" :item)))
    (is (= AlarmState/INSUFFICIENT_DATA (alarm-state {:item :insufficient-data} "test" :item)))
    (is (= AlarmState/INSUFFICIENT_DATA (alarm-state {:test/item :insufficient-data} "test" :item)))
    (is (= AlarmState/ALARM (alarm-state {:item :alarm} "test" :item)))
    (is (= AlarmState/ALARM (alarm-state {:test/item :alarm} "test" :item)))))


(deftest alarm-status-widget-sort-by-test
  (testing "Testing enum function alarm-status-widget-sort-by"
    (is (= AlarmStatusWidgetSortBy/DEFAULT (alarm-status-widget-sort-by {:item AlarmStatusWidgetSortBy/DEFAULT} "test" :item)))
    (is (= AlarmStatusWidgetSortBy/DEFAULT (alarm-status-widget-sort-by {:test/item AlarmStatusWidgetSortBy/DEFAULT} "test" :item)))
    (is (= AlarmStatusWidgetSortBy/STATE_UPDATED_TIMESTAMP (alarm-status-widget-sort-by {:item AlarmStatusWidgetSortBy/STATE_UPDATED_TIMESTAMP} "test" :item)))
    (is (= AlarmStatusWidgetSortBy/STATE_UPDATED_TIMESTAMP (alarm-status-widget-sort-by {:test/item AlarmStatusWidgetSortBy/STATE_UPDATED_TIMESTAMP} "test" :item)))
    (is (= AlarmStatusWidgetSortBy/TIMESTAMP (alarm-status-widget-sort-by {:item AlarmStatusWidgetSortBy/TIMESTAMP} "test" :item)))
    (is (= AlarmStatusWidgetSortBy/TIMESTAMP (alarm-status-widget-sort-by {:test/item AlarmStatusWidgetSortBy/TIMESTAMP} "test" :item)))
    (is (= AlarmStatusWidgetSortBy/DEFAULT (alarm-status-widget-sort-by {:item :default} "test" :item)))
    (is (= AlarmStatusWidgetSortBy/DEFAULT (alarm-status-widget-sort-by {:test/item :default} "test" :item)))
    (is (= AlarmStatusWidgetSortBy/STATE_UPDATED_TIMESTAMP (alarm-status-widget-sort-by {:item :state-updated-timestamp} "test" :item)))
    (is (= AlarmStatusWidgetSortBy/STATE_UPDATED_TIMESTAMP (alarm-status-widget-sort-by {:test/item :state-updated-timestamp} "test" :item)))
    (is (= AlarmStatusWidgetSortBy/TIMESTAMP (alarm-status-widget-sort-by {:item :timestamp} "test" :item)))
    (is (= AlarmStatusWidgetSortBy/TIMESTAMP (alarm-status-widget-sort-by {:test/item :timestamp} "test" :item)))))


(deftest comparison-operator-test
  (testing "Testing enum function comparison-operator"
    (is (= ComparisonOperator/GREATER_THAN_UPPER_THRESHOLD (comparison-operator {:item ComparisonOperator/GREATER_THAN_UPPER_THRESHOLD} "test" :item)))
    (is (= ComparisonOperator/GREATER_THAN_UPPER_THRESHOLD (comparison-operator {:test/item ComparisonOperator/GREATER_THAN_UPPER_THRESHOLD} "test" :item)))
    (is (= ComparisonOperator/LESS_THAN_LOWER_OR_GREATER_THAN_UPPER_THRESHOLD (comparison-operator {:item ComparisonOperator/LESS_THAN_LOWER_OR_GREATER_THAN_UPPER_THRESHOLD} "test" :item)))
    (is (= ComparisonOperator/LESS_THAN_LOWER_OR_GREATER_THAN_UPPER_THRESHOLD (comparison-operator {:test/item ComparisonOperator/LESS_THAN_LOWER_OR_GREATER_THAN_UPPER_THRESHOLD} "test" :item)))
    (is (= ComparisonOperator/LESS_THAN_LOWER_THRESHOLD (comparison-operator {:item ComparisonOperator/LESS_THAN_LOWER_THRESHOLD} "test" :item)))
    (is (= ComparisonOperator/LESS_THAN_LOWER_THRESHOLD (comparison-operator {:test/item ComparisonOperator/LESS_THAN_LOWER_THRESHOLD} "test" :item)))
    (is (= ComparisonOperator/GREATER_THAN_THRESHOLD (comparison-operator {:item ComparisonOperator/GREATER_THAN_THRESHOLD} "test" :item)))
    (is (= ComparisonOperator/GREATER_THAN_THRESHOLD (comparison-operator {:test/item ComparisonOperator/GREATER_THAN_THRESHOLD} "test" :item)))
    (is (= ComparisonOperator/LESS_THAN_THRESHOLD (comparison-operator {:item ComparisonOperator/LESS_THAN_THRESHOLD} "test" :item)))
    (is (= ComparisonOperator/LESS_THAN_THRESHOLD (comparison-operator {:test/item ComparisonOperator/LESS_THAN_THRESHOLD} "test" :item)))
    (is (= ComparisonOperator/GREATER_THAN_OR_EQUAL_TO_THRESHOLD (comparison-operator {:item ComparisonOperator/GREATER_THAN_OR_EQUAL_TO_THRESHOLD} "test" :item)))
    (is (= ComparisonOperator/GREATER_THAN_OR_EQUAL_TO_THRESHOLD (comparison-operator {:test/item ComparisonOperator/GREATER_THAN_OR_EQUAL_TO_THRESHOLD} "test" :item)))
    (is (= ComparisonOperator/LESS_THAN_OR_EQUAL_TO_THRESHOLD (comparison-operator {:item ComparisonOperator/LESS_THAN_OR_EQUAL_TO_THRESHOLD} "test" :item)))
    (is (= ComparisonOperator/LESS_THAN_OR_EQUAL_TO_THRESHOLD (comparison-operator {:test/item ComparisonOperator/LESS_THAN_OR_EQUAL_TO_THRESHOLD} "test" :item)))
    (is (= ComparisonOperator/GREATER_THAN_UPPER_THRESHOLD (comparison-operator {:item :greater-than-upper-threshold} "test" :item)))
    (is (= ComparisonOperator/GREATER_THAN_UPPER_THRESHOLD (comparison-operator {:test/item :greater-than-upper-threshold} "test" :item)))
    (is (= ComparisonOperator/LESS_THAN_LOWER_OR_GREATER_THAN_UPPER_THRESHOLD (comparison-operator {:item :less-than-lower-or-greater-than-upper-threshold} "test" :item)))
    (is (= ComparisonOperator/LESS_THAN_LOWER_OR_GREATER_THAN_UPPER_THRESHOLD (comparison-operator {:test/item :less-than-lower-or-greater-than-upper-threshold} "test" :item)))
    (is (= ComparisonOperator/LESS_THAN_LOWER_THRESHOLD (comparison-operator {:item :less-than-lower-threshold} "test" :item)))
    (is (= ComparisonOperator/LESS_THAN_LOWER_THRESHOLD (comparison-operator {:test/item :less-than-lower-threshold} "test" :item)))
    (is (= ComparisonOperator/GREATER_THAN_THRESHOLD (comparison-operator {:item :greater-than-threshold} "test" :item)))
    (is (= ComparisonOperator/GREATER_THAN_THRESHOLD (comparison-operator {:test/item :greater-than-threshold} "test" :item)))
    (is (= ComparisonOperator/LESS_THAN_THRESHOLD (comparison-operator {:item :less-than-threshold} "test" :item)))
    (is (= ComparisonOperator/LESS_THAN_THRESHOLD (comparison-operator {:test/item :less-than-threshold} "test" :item)))
    (is (= ComparisonOperator/GREATER_THAN_OR_EQUAL_TO_THRESHOLD (comparison-operator {:item :greater-than-or-equal-to-threshold} "test" :item)))
    (is (= ComparisonOperator/GREATER_THAN_OR_EQUAL_TO_THRESHOLD (comparison-operator {:test/item :greater-than-or-equal-to-threshold} "test" :item)))
    (is (= ComparisonOperator/LESS_THAN_OR_EQUAL_TO_THRESHOLD (comparison-operator {:item :less-than-or-equal-to-threshold} "test" :item)))
    (is (= ComparisonOperator/LESS_THAN_OR_EQUAL_TO_THRESHOLD (comparison-operator {:test/item :less-than-or-equal-to-threshold} "test" :item)))))


(deftest graph-widget-view-test
  (testing "Testing enum function graph-widget-view"
    (is (= GraphWidgetView/TIME_SERIES (graph-widget-view {:item GraphWidgetView/TIME_SERIES} "test" :item)))
    (is (= GraphWidgetView/TIME_SERIES (graph-widget-view {:test/item GraphWidgetView/TIME_SERIES} "test" :item)))
    (is (= GraphWidgetView/PIE (graph-widget-view {:item GraphWidgetView/PIE} "test" :item)))
    (is (= GraphWidgetView/PIE (graph-widget-view {:test/item GraphWidgetView/PIE} "test" :item)))
    (is (= GraphWidgetView/BAR (graph-widget-view {:item GraphWidgetView/BAR} "test" :item)))
    (is (= GraphWidgetView/BAR (graph-widget-view {:test/item GraphWidgetView/BAR} "test" :item)))
    (is (= GraphWidgetView/TIME_SERIES (graph-widget-view {:item :time-series} "test" :item)))
    (is (= GraphWidgetView/TIME_SERIES (graph-widget-view {:test/item :time-series} "test" :item)))
    (is (= GraphWidgetView/PIE (graph-widget-view {:item :pie} "test" :item)))
    (is (= GraphWidgetView/PIE (graph-widget-view {:test/item :pie} "test" :item)))
    (is (= GraphWidgetView/BAR (graph-widget-view {:item :bar} "test" :item)))
    (is (= GraphWidgetView/BAR (graph-widget-view {:test/item :bar} "test" :item)))))


(deftest legend-position-test
  (testing "Testing enum function legend-position"
    (is (= LegendPosition/BOTTOM (legend-position {:item LegendPosition/BOTTOM} "test" :item)))
    (is (= LegendPosition/BOTTOM (legend-position {:test/item LegendPosition/BOTTOM} "test" :item)))
    (is (= LegendPosition/HIDDEN (legend-position {:item LegendPosition/HIDDEN} "test" :item)))
    (is (= LegendPosition/HIDDEN (legend-position {:test/item LegendPosition/HIDDEN} "test" :item)))
    (is (= LegendPosition/RIGHT (legend-position {:item LegendPosition/RIGHT} "test" :item)))
    (is (= LegendPosition/RIGHT (legend-position {:test/item LegendPosition/RIGHT} "test" :item)))
    (is (= LegendPosition/BOTTOM (legend-position {:item :bottom} "test" :item)))
    (is (= LegendPosition/BOTTOM (legend-position {:test/item :bottom} "test" :item)))
    (is (= LegendPosition/HIDDEN (legend-position {:item :hidden} "test" :item)))
    (is (= LegendPosition/HIDDEN (legend-position {:test/item :hidden} "test" :item)))
    (is (= LegendPosition/RIGHT (legend-position {:item :right} "test" :item)))
    (is (= LegendPosition/RIGHT (legend-position {:test/item :right} "test" :item)))))


(deftest log-query-visualization-type-test
  (testing "Testing enum function log-query-visualization-type"
    (is (= LogQueryVisualizationType/STACKEDAREA (log-query-visualization-type {:item LogQueryVisualizationType/STACKEDAREA} "test" :item)))
    (is (= LogQueryVisualizationType/STACKEDAREA (log-query-visualization-type {:test/item LogQueryVisualizationType/STACKEDAREA} "test" :item)))
    (is (= LogQueryVisualizationType/BAR (log-query-visualization-type {:item LogQueryVisualizationType/BAR} "test" :item)))
    (is (= LogQueryVisualizationType/BAR (log-query-visualization-type {:test/item LogQueryVisualizationType/BAR} "test" :item)))
    (is (= LogQueryVisualizationType/LINE (log-query-visualization-type {:item LogQueryVisualizationType/LINE} "test" :item)))
    (is (= LogQueryVisualizationType/LINE (log-query-visualization-type {:test/item LogQueryVisualizationType/LINE} "test" :item)))
    (is (= LogQueryVisualizationType/TABLE (log-query-visualization-type {:item LogQueryVisualizationType/TABLE} "test" :item)))
    (is (= LogQueryVisualizationType/TABLE (log-query-visualization-type {:test/item LogQueryVisualizationType/TABLE} "test" :item)))
    (is (= LogQueryVisualizationType/PIE (log-query-visualization-type {:item LogQueryVisualizationType/PIE} "test" :item)))
    (is (= LogQueryVisualizationType/PIE (log-query-visualization-type {:test/item LogQueryVisualizationType/PIE} "test" :item)))
    (is (= LogQueryVisualizationType/STACKEDAREA (log-query-visualization-type {:item :stackedarea} "test" :item)))
    (is (= LogQueryVisualizationType/STACKEDAREA (log-query-visualization-type {:test/item :stackedarea} "test" :item)))
    (is (= LogQueryVisualizationType/BAR (log-query-visualization-type {:item :bar} "test" :item)))
    (is (= LogQueryVisualizationType/BAR (log-query-visualization-type {:test/item :bar} "test" :item)))
    (is (= LogQueryVisualizationType/LINE (log-query-visualization-type {:item :line} "test" :item)))
    (is (= LogQueryVisualizationType/LINE (log-query-visualization-type {:test/item :line} "test" :item)))
    (is (= LogQueryVisualizationType/TABLE (log-query-visualization-type {:item :table} "test" :item)))
    (is (= LogQueryVisualizationType/TABLE (log-query-visualization-type {:test/item :table} "test" :item)))
    (is (= LogQueryVisualizationType/PIE (log-query-visualization-type {:item :pie} "test" :item)))
    (is (= LogQueryVisualizationType/PIE (log-query-visualization-type {:test/item :pie} "test" :item)))))


(deftest period-override-test
  (testing "Testing enum function period-override"
    (is (= PeriodOverride/AUTO (period-override {:item PeriodOverride/AUTO} "test" :item)))
    (is (= PeriodOverride/AUTO (period-override {:test/item PeriodOverride/AUTO} "test" :item)))
    (is (= PeriodOverride/INHERIT (period-override {:item PeriodOverride/INHERIT} "test" :item)))
    (is (= PeriodOverride/INHERIT (period-override {:test/item PeriodOverride/INHERIT} "test" :item)))
    (is (= PeriodOverride/AUTO (period-override {:item :auto} "test" :item)))
    (is (= PeriodOverride/AUTO (period-override {:test/item :auto} "test" :item)))
    (is (= PeriodOverride/INHERIT (period-override {:item :inherit} "test" :item)))
    (is (= PeriodOverride/INHERIT (period-override {:test/item :inherit} "test" :item)))))


(deftest shading-test
  (testing "Testing enum function shading"
    (is (= Shading/NONE (shading {:item Shading/NONE} "test" :item)))
    (is (= Shading/NONE (shading {:test/item Shading/NONE} "test" :item)))
    (is (= Shading/ABOVE (shading {:item Shading/ABOVE} "test" :item)))
    (is (= Shading/ABOVE (shading {:test/item Shading/ABOVE} "test" :item)))
    (is (= Shading/BELOW (shading {:item Shading/BELOW} "test" :item)))
    (is (= Shading/BELOW (shading {:test/item Shading/BELOW} "test" :item)))
    (is (= Shading/NONE (shading {:item :none} "test" :item)))
    (is (= Shading/NONE (shading {:test/item :none} "test" :item)))
    (is (= Shading/ABOVE (shading {:item :above} "test" :item)))
    (is (= Shading/ABOVE (shading {:test/item :above} "test" :item)))
    (is (= Shading/BELOW (shading {:item :below} "test" :item)))
    (is (= Shading/BELOW (shading {:test/item :below} "test" :item)))))


(deftest table-layout-test
  (testing "Testing enum function table-layout"
    (is (= TableLayout/HORIZONTAL (table-layout {:item TableLayout/HORIZONTAL} "test" :item)))
    (is (= TableLayout/HORIZONTAL (table-layout {:test/item TableLayout/HORIZONTAL} "test" :item)))
    (is (= TableLayout/VERTICAL (table-layout {:item TableLayout/VERTICAL} "test" :item)))
    (is (= TableLayout/VERTICAL (table-layout {:test/item TableLayout/VERTICAL} "test" :item)))
    (is (= TableLayout/HORIZONTAL (table-layout {:item :horizontal} "test" :item)))
    (is (= TableLayout/HORIZONTAL (table-layout {:test/item :horizontal} "test" :item)))
    (is (= TableLayout/VERTICAL (table-layout {:item :vertical} "test" :item)))
    (is (= TableLayout/VERTICAL (table-layout {:test/item :vertical} "test" :item)))))


(deftest table-summary-column-test
  (testing "Testing enum function table-summary-column"
    (is (= TableSummaryColumn/SUM (table-summary-column {:item TableSummaryColumn/SUM} "test" :item)))
    (is (= TableSummaryColumn/SUM (table-summary-column {:test/item TableSummaryColumn/SUM} "test" :item)))
    (is (= TableSummaryColumn/MAXIMUM (table-summary-column {:item TableSummaryColumn/MAXIMUM} "test" :item)))
    (is (= TableSummaryColumn/MAXIMUM (table-summary-column {:test/item TableSummaryColumn/MAXIMUM} "test" :item)))
    (is (= TableSummaryColumn/AVERAGE (table-summary-column {:item TableSummaryColumn/AVERAGE} "test" :item)))
    (is (= TableSummaryColumn/AVERAGE (table-summary-column {:test/item TableSummaryColumn/AVERAGE} "test" :item)))
    (is (= TableSummaryColumn/MINIMUM (table-summary-column {:item TableSummaryColumn/MINIMUM} "test" :item)))
    (is (= TableSummaryColumn/MINIMUM (table-summary-column {:test/item TableSummaryColumn/MINIMUM} "test" :item)))
    (is (= TableSummaryColumn/SUM (table-summary-column {:item :sum} "test" :item)))
    (is (= TableSummaryColumn/SUM (table-summary-column {:test/item :sum} "test" :item)))
    (is (= TableSummaryColumn/MAXIMUM (table-summary-column {:item :maximum} "test" :item)))
    (is (= TableSummaryColumn/MAXIMUM (table-summary-column {:test/item :maximum} "test" :item)))
    (is (= TableSummaryColumn/AVERAGE (table-summary-column {:item :average} "test" :item)))
    (is (= TableSummaryColumn/AVERAGE (table-summary-column {:test/item :average} "test" :item)))
    (is (= TableSummaryColumn/MINIMUM (table-summary-column {:item :minimum} "test" :item)))
    (is (= TableSummaryColumn/MINIMUM (table-summary-column {:test/item :minimum} "test" :item)))))


(deftest text-widget-background-test
  (testing "Testing enum function text-widget-background"
    (is (= TextWidgetBackground/TRANSPARENT (text-widget-background {:item TextWidgetBackground/TRANSPARENT} "test" :item)))
    (is (= TextWidgetBackground/TRANSPARENT (text-widget-background {:test/item TextWidgetBackground/TRANSPARENT} "test" :item)))
    (is (= TextWidgetBackground/SOLID (text-widget-background {:item TextWidgetBackground/SOLID} "test" :item)))
    (is (= TextWidgetBackground/SOLID (text-widget-background {:test/item TextWidgetBackground/SOLID} "test" :item)))
    (is (= TextWidgetBackground/TRANSPARENT (text-widget-background {:item :transparent} "test" :item)))
    (is (= TextWidgetBackground/TRANSPARENT (text-widget-background {:test/item :transparent} "test" :item)))
    (is (= TextWidgetBackground/SOLID (text-widget-background {:item :solid} "test" :item)))
    (is (= TextWidgetBackground/SOLID (text-widget-background {:test/item :solid} "test" :item)))))


(deftest treat-missing-data-test
  (testing "Testing enum function treat-missing-data"
    (is (= TreatMissingData/IGNORE (treat-missing-data {:item TreatMissingData/IGNORE} "test" :item)))
    (is (= TreatMissingData/IGNORE (treat-missing-data {:test/item TreatMissingData/IGNORE} "test" :item)))
    (is (= TreatMissingData/NOT_BREACHING (treat-missing-data {:item TreatMissingData/NOT_BREACHING} "test" :item)))
    (is (= TreatMissingData/NOT_BREACHING (treat-missing-data {:test/item TreatMissingData/NOT_BREACHING} "test" :item)))
    (is (= TreatMissingData/MISSING (treat-missing-data {:item TreatMissingData/MISSING} "test" :item)))
    (is (= TreatMissingData/MISSING (treat-missing-data {:test/item TreatMissingData/MISSING} "test" :item)))
    (is (= TreatMissingData/BREACHING (treat-missing-data {:item TreatMissingData/BREACHING} "test" :item)))
    (is (= TreatMissingData/BREACHING (treat-missing-data {:test/item TreatMissingData/BREACHING} "test" :item)))
    (is (= TreatMissingData/IGNORE (treat-missing-data {:item :ignore} "test" :item)))
    (is (= TreatMissingData/IGNORE (treat-missing-data {:test/item :ignore} "test" :item)))
    (is (= TreatMissingData/NOT_BREACHING (treat-missing-data {:item :not-breaching} "test" :item)))
    (is (= TreatMissingData/NOT_BREACHING (treat-missing-data {:test/item :not-breaching} "test" :item)))
    (is (= TreatMissingData/MISSING (treat-missing-data {:item :missing} "test" :item)))
    (is (= TreatMissingData/MISSING (treat-missing-data {:test/item :missing} "test" :item)))
    (is (= TreatMissingData/BREACHING (treat-missing-data {:item :breaching} "test" :item)))
    (is (= TreatMissingData/BREACHING (treat-missing-data {:test/item :breaching} "test" :item)))))


(deftest unit-test
  (testing "Testing enum function unit"
    (is (= Unit/MEGABITS_PER_SECOND (unit {:item Unit/MEGABITS_PER_SECOND} "test" :item)))
    (is (= Unit/MEGABITS_PER_SECOND (unit {:test/item Unit/MEGABITS_PER_SECOND} "test" :item)))
    (is (= Unit/TERABITS_PER_SECOND (unit {:item Unit/TERABITS_PER_SECOND} "test" :item)))
    (is (= Unit/TERABITS_PER_SECOND (unit {:test/item Unit/TERABITS_PER_SECOND} "test" :item)))
    (is (= Unit/GIGABITS (unit {:item Unit/GIGABITS} "test" :item)))
    (is (= Unit/GIGABITS (unit {:test/item Unit/GIGABITS} "test" :item)))
    (is (= Unit/TERABYTES (unit {:item Unit/TERABYTES} "test" :item)))
    (is (= Unit/TERABYTES (unit {:test/item Unit/TERABYTES} "test" :item)))
    (is (= Unit/KILOBITS_PER_SECOND (unit {:item Unit/KILOBITS_PER_SECOND} "test" :item)))
    (is (= Unit/KILOBITS_PER_SECOND (unit {:test/item Unit/KILOBITS_PER_SECOND} "test" :item)))
    (is (= Unit/KILOBYTES (unit {:item Unit/KILOBYTES} "test" :item)))
    (is (= Unit/KILOBYTES (unit {:test/item Unit/KILOBYTES} "test" :item)))
    (is (= Unit/COUNT (unit {:item Unit/COUNT} "test" :item)))
    (is (= Unit/COUNT (unit {:test/item Unit/COUNT} "test" :item)))
    (is (= Unit/MILLISECONDS (unit {:item Unit/MILLISECONDS} "test" :item)))
    (is (= Unit/MILLISECONDS (unit {:test/item Unit/MILLISECONDS} "test" :item)))
    (is (= Unit/MEGABYTES_PER_SECOND (unit {:item Unit/MEGABYTES_PER_SECOND} "test" :item)))
    (is (= Unit/MEGABYTES_PER_SECOND (unit {:test/item Unit/MEGABYTES_PER_SECOND} "test" :item)))
    (is (= Unit/TERABYTES_PER_SECOND (unit {:item Unit/TERABYTES_PER_SECOND} "test" :item)))
    (is (= Unit/TERABYTES_PER_SECOND (unit {:test/item Unit/TERABYTES_PER_SECOND} "test" :item)))
    (is (= Unit/PERCENT (unit {:item Unit/PERCENT} "test" :item)))
    (is (= Unit/PERCENT (unit {:test/item Unit/PERCENT} "test" :item)))
    (is (= Unit/MEGABITS (unit {:item Unit/MEGABITS} "test" :item)))
    (is (= Unit/MEGABITS (unit {:test/item Unit/MEGABITS} "test" :item)))
    (is (= Unit/COUNT_PER_SECOND (unit {:item Unit/COUNT_PER_SECOND} "test" :item)))
    (is (= Unit/COUNT_PER_SECOND (unit {:test/item Unit/COUNT_PER_SECOND} "test" :item)))
    (is (= Unit/NONE (unit {:item Unit/NONE} "test" :item)))
    (is (= Unit/NONE (unit {:test/item Unit/NONE} "test" :item)))
    (is (= Unit/MICROSECONDS (unit {:item Unit/MICROSECONDS} "test" :item)))
    (is (= Unit/MICROSECONDS (unit {:test/item Unit/MICROSECONDS} "test" :item)))
    (is (= Unit/MEGABYTES (unit {:item Unit/MEGABYTES} "test" :item)))
    (is (= Unit/MEGABYTES (unit {:test/item Unit/MEGABYTES} "test" :item)))
    (is (= Unit/KILOBITS (unit {:item Unit/KILOBITS} "test" :item)))
    (is (= Unit/KILOBITS (unit {:test/item Unit/KILOBITS} "test" :item)))
    (is (= Unit/BYTES (unit {:item Unit/BYTES} "test" :item)))
    (is (= Unit/BYTES (unit {:test/item Unit/BYTES} "test" :item)))
    (is (= Unit/SECONDS (unit {:item Unit/SECONDS} "test" :item)))
    (is (= Unit/SECONDS (unit {:test/item Unit/SECONDS} "test" :item)))
    (is (= Unit/KILOBYTES_PER_SECOND (unit {:item Unit/KILOBYTES_PER_SECOND} "test" :item)))
    (is (= Unit/KILOBYTES_PER_SECOND (unit {:test/item Unit/KILOBYTES_PER_SECOND} "test" :item)))
    (is (= Unit/GIGABYTES_PER_SECOND (unit {:item Unit/GIGABYTES_PER_SECOND} "test" :item)))
    (is (= Unit/GIGABYTES_PER_SECOND (unit {:test/item Unit/GIGABYTES_PER_SECOND} "test" :item)))
    (is (= Unit/BYTES_PER_SECOND (unit {:item Unit/BYTES_PER_SECOND} "test" :item)))
    (is (= Unit/BYTES_PER_SECOND (unit {:test/item Unit/BYTES_PER_SECOND} "test" :item)))
    (is (= Unit/BITS_PER_SECOND (unit {:item Unit/BITS_PER_SECOND} "test" :item)))
    (is (= Unit/BITS_PER_SECOND (unit {:test/item Unit/BITS_PER_SECOND} "test" :item)))
    (is (= Unit/TERABITS (unit {:item Unit/TERABITS} "test" :item)))
    (is (= Unit/TERABITS (unit {:test/item Unit/TERABITS} "test" :item)))
    (is (= Unit/GIGABYTES (unit {:item Unit/GIGABYTES} "test" :item)))
    (is (= Unit/GIGABYTES (unit {:test/item Unit/GIGABYTES} "test" :item)))
    (is (= Unit/GIGABITS_PER_SECOND (unit {:item Unit/GIGABITS_PER_SECOND} "test" :item)))
    (is (= Unit/GIGABITS_PER_SECOND (unit {:test/item Unit/GIGABITS_PER_SECOND} "test" :item)))
    (is (= Unit/BITS (unit {:item Unit/BITS} "test" :item)))
    (is (= Unit/BITS (unit {:test/item Unit/BITS} "test" :item)))
    (is (= Unit/MEGABITS_PER_SECOND (unit {:item :megabits-per-second} "test" :item)))
    (is (= Unit/MEGABITS_PER_SECOND (unit {:test/item :megabits-per-second} "test" :item)))
    (is (= Unit/TERABITS_PER_SECOND (unit {:item :terabits-per-second} "test" :item)))
    (is (= Unit/TERABITS_PER_SECOND (unit {:test/item :terabits-per-second} "test" :item)))
    (is (= Unit/GIGABITS (unit {:item :gigabits} "test" :item)))
    (is (= Unit/GIGABITS (unit {:test/item :gigabits} "test" :item)))
    (is (= Unit/TERABYTES (unit {:item :terabytes} "test" :item)))
    (is (= Unit/TERABYTES (unit {:test/item :terabytes} "test" :item)))
    (is (= Unit/KILOBITS_PER_SECOND (unit {:item :kilobits-per-second} "test" :item)))
    (is (= Unit/KILOBITS_PER_SECOND (unit {:test/item :kilobits-per-second} "test" :item)))
    (is (= Unit/KILOBYTES (unit {:item :kilobytes} "test" :item)))
    (is (= Unit/KILOBYTES (unit {:test/item :kilobytes} "test" :item)))
    (is (= Unit/COUNT (unit {:item :count} "test" :item)))
    (is (= Unit/COUNT (unit {:test/item :count} "test" :item)))
    (is (= Unit/MILLISECONDS (unit {:item :milliseconds} "test" :item)))
    (is (= Unit/MILLISECONDS (unit {:test/item :milliseconds} "test" :item)))
    (is (= Unit/MEGABYTES_PER_SECOND (unit {:item :megabytes-per-second} "test" :item)))
    (is (= Unit/MEGABYTES_PER_SECOND (unit {:test/item :megabytes-per-second} "test" :item)))
    (is (= Unit/TERABYTES_PER_SECOND (unit {:item :terabytes-per-second} "test" :item)))
    (is (= Unit/TERABYTES_PER_SECOND (unit {:test/item :terabytes-per-second} "test" :item)))
    (is (= Unit/PERCENT (unit {:item :percent} "test" :item)))
    (is (= Unit/PERCENT (unit {:test/item :percent} "test" :item)))
    (is (= Unit/MEGABITS (unit {:item :megabits} "test" :item)))
    (is (= Unit/MEGABITS (unit {:test/item :megabits} "test" :item)))
    (is (= Unit/COUNT_PER_SECOND (unit {:item :count-per-second} "test" :item)))
    (is (= Unit/COUNT_PER_SECOND (unit {:test/item :count-per-second} "test" :item)))
    (is (= Unit/NONE (unit {:item :none} "test" :item)))
    (is (= Unit/NONE (unit {:test/item :none} "test" :item)))
    (is (= Unit/MICROSECONDS (unit {:item :microseconds} "test" :item)))
    (is (= Unit/MICROSECONDS (unit {:test/item :microseconds} "test" :item)))
    (is (= Unit/MEGABYTES (unit {:item :megabytes} "test" :item)))
    (is (= Unit/MEGABYTES (unit {:test/item :megabytes} "test" :item)))
    (is (= Unit/KILOBITS (unit {:item :kilobits} "test" :item)))
    (is (= Unit/KILOBITS (unit {:test/item :kilobits} "test" :item)))
    (is (= Unit/BYTES (unit {:item :bytes} "test" :item)))
    (is (= Unit/BYTES (unit {:test/item :bytes} "test" :item)))
    (is (= Unit/SECONDS (unit {:item :seconds} "test" :item)))
    (is (= Unit/SECONDS (unit {:test/item :seconds} "test" :item)))
    (is (= Unit/KILOBYTES_PER_SECOND (unit {:item :kilobytes-per-second} "test" :item)))
    (is (= Unit/KILOBYTES_PER_SECOND (unit {:test/item :kilobytes-per-second} "test" :item)))
    (is (= Unit/GIGABYTES_PER_SECOND (unit {:item :gigabytes-per-second} "test" :item)))
    (is (= Unit/GIGABYTES_PER_SECOND (unit {:test/item :gigabytes-per-second} "test" :item)))
    (is (= Unit/BYTES_PER_SECOND (unit {:item :bytes-per-second} "test" :item)))
    (is (= Unit/BYTES_PER_SECOND (unit {:test/item :bytes-per-second} "test" :item)))
    (is (= Unit/BITS_PER_SECOND (unit {:item :bits-per-second} "test" :item)))
    (is (= Unit/BITS_PER_SECOND (unit {:test/item :bits-per-second} "test" :item)))
    (is (= Unit/TERABITS (unit {:item :terabits} "test" :item)))
    (is (= Unit/TERABITS (unit {:test/item :terabits} "test" :item)))
    (is (= Unit/GIGABYTES (unit {:item :gigabytes} "test" :item)))
    (is (= Unit/GIGABYTES (unit {:test/item :gigabytes} "test" :item)))
    (is (= Unit/GIGABITS_PER_SECOND (unit {:item :gigabits-per-second} "test" :item)))
    (is (= Unit/GIGABITS_PER_SECOND (unit {:test/item :gigabits-per-second} "test" :item)))
    (is (= Unit/BITS (unit {:item :bits} "test" :item)))
    (is (= Unit/BITS (unit {:test/item :bits} "test" :item)))))


(deftest variable-input-type-test
  (testing "Testing enum function variable-input-type"
    (is (= VariableInputType/INPUT (variable-input-type {:item VariableInputType/INPUT} "test" :item)))
    (is (= VariableInputType/INPUT (variable-input-type {:test/item VariableInputType/INPUT} "test" :item)))
    (is (= VariableInputType/SELECT (variable-input-type {:item VariableInputType/SELECT} "test" :item)))
    (is (= VariableInputType/SELECT (variable-input-type {:test/item VariableInputType/SELECT} "test" :item)))
    (is (= VariableInputType/RADIO (variable-input-type {:item VariableInputType/RADIO} "test" :item)))
    (is (= VariableInputType/RADIO (variable-input-type {:test/item VariableInputType/RADIO} "test" :item)))
    (is (= VariableInputType/INPUT (variable-input-type {:item :input} "test" :item)))
    (is (= VariableInputType/INPUT (variable-input-type {:test/item :input} "test" :item)))
    (is (= VariableInputType/SELECT (variable-input-type {:item :select} "test" :item)))
    (is (= VariableInputType/SELECT (variable-input-type {:test/item :select} "test" :item)))
    (is (= VariableInputType/RADIO (variable-input-type {:item :radio} "test" :item)))
    (is (= VariableInputType/RADIO (variable-input-type {:test/item :radio} "test" :item)))))


(deftest variable-type-test
  (testing "Testing enum function variable-type"
    (is (= VariableType/PATTERN (variable-type {:item VariableType/PATTERN} "test" :item)))
    (is (= VariableType/PATTERN (variable-type {:test/item VariableType/PATTERN} "test" :item)))
    (is (= VariableType/PROPERTY (variable-type {:item VariableType/PROPERTY} "test" :item)))
    (is (= VariableType/PROPERTY (variable-type {:test/item VariableType/PROPERTY} "test" :item)))
    (is (= VariableType/PATTERN (variable-type {:item :pattern} "test" :item)))
    (is (= VariableType/PATTERN (variable-type {:test/item :pattern} "test" :item)))
    (is (= VariableType/PROPERTY (variable-type {:item :property} "test" :item)))
    (is (= VariableType/PROPERTY (variable-type {:test/item :property} "test" :item)))))


(deftest vertical-shading-test
  (testing "Testing enum function vertical-shading"
    (is (= VerticalShading/BEFORE (vertical-shading {:item VerticalShading/BEFORE} "test" :item)))
    (is (= VerticalShading/BEFORE (vertical-shading {:test/item VerticalShading/BEFORE} "test" :item)))
    (is (= VerticalShading/AFTER (vertical-shading {:item VerticalShading/AFTER} "test" :item)))
    (is (= VerticalShading/AFTER (vertical-shading {:test/item VerticalShading/AFTER} "test" :item)))
    (is (= VerticalShading/NONE (vertical-shading {:item VerticalShading/NONE} "test" :item)))
    (is (= VerticalShading/NONE (vertical-shading {:test/item VerticalShading/NONE} "test" :item)))
    (is (= VerticalShading/BEFORE (vertical-shading {:item :before} "test" :item)))
    (is (= VerticalShading/BEFORE (vertical-shading {:test/item :before} "test" :item)))
    (is (= VerticalShading/AFTER (vertical-shading {:item :after} "test" :item)))
    (is (= VerticalShading/AFTER (vertical-shading {:test/item :after} "test" :item)))
    (is (= VerticalShading/NONE (vertical-shading {:item :none} "test" :item)))
    (is (= VerticalShading/NONE (vertical-shading {:test/item :none} "test" :item)))))