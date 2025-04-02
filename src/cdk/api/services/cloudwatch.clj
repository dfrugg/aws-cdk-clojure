(ns cdk.api.services.cloudwatch
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.cloudwatch package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.cloudwatch Alarm$Builder
                                                       AlarmActionConfig$Builder
                                                       AlarmProps$Builder
                                                       AlarmState
                                                       AlarmStatusWidget$Builder
                                                       AlarmStatusWidgetProps$Builder
                                                       AlarmStatusWidgetSortBy
                                                       AlarmWidget$Builder
                                                       AlarmWidgetProps$Builder
                                                       CfnAlarm$Builder
                                                       CfnAlarm$DimensionProperty$Builder
                                                       CfnAlarm$MetricDataQueryProperty$Builder
                                                       CfnAlarm$MetricProperty$Builder
                                                       CfnAlarm$MetricStatProperty$Builder
                                                       CfnAlarmProps$Builder
                                                       CfnAnomalyDetector$Builder
                                                       CfnAnomalyDetector$ConfigurationProperty$Builder
                                                       CfnAnomalyDetector$DimensionProperty$Builder
                                                       CfnAnomalyDetector$MetricCharacteristicsProperty$Builder
                                                       CfnAnomalyDetector$MetricDataQueryProperty$Builder
                                                       CfnAnomalyDetector$MetricMathAnomalyDetectorProperty$Builder
                                                       CfnAnomalyDetector$MetricProperty$Builder
                                                       CfnAnomalyDetector$MetricStatProperty$Builder
                                                       CfnAnomalyDetector$RangeProperty$Builder
                                                       CfnAnomalyDetector$SingleMetricAnomalyDetectorProperty$Builder
                                                       CfnAnomalyDetectorProps$Builder
                                                       CfnCompositeAlarm$Builder
                                                       CfnCompositeAlarmProps$Builder
                                                       CfnDashboard$Builder
                                                       CfnDashboardProps$Builder
                                                       CfnInsightRule$Builder
                                                       CfnInsightRuleProps$Builder
                                                       CfnMetricStream$Builder
                                                       CfnMetricStream$MetricStreamFilterProperty$Builder
                                                       CfnMetricStream$MetricStreamStatisticsConfigurationProperty$Builder
                                                       CfnMetricStream$MetricStreamStatisticsMetricProperty$Builder
                                                       CfnMetricStreamProps$Builder
                                                       CommonMetricOptions$Builder
                                                       ComparisonOperator
                                                       CompositeAlarm$Builder
                                                       CompositeAlarmProps$Builder
                                                       CreateAlarmOptions$Builder
                                                       CustomWidget$Builder
                                                       CustomWidgetProps$Builder
                                                       Dashboard$Builder
                                                       DashboardProps$Builder
                                                       DashboardVariable$Builder
                                                       DashboardVariableOptions$Builder
                                                       Dimension$Builder
                                                       GaugeWidget$Builder
                                                       GaugeWidgetProps$Builder
                                                       GraphWidget$Builder
                                                       GraphWidgetProps$Builder
                                                       GraphWidgetView
                                                       HorizontalAnnotation$Builder
                                                       LegendPosition
                                                       LogQueryVisualizationType
                                                       LogQueryWidget$Builder
                                                       LogQueryWidgetProps$Builder
                                                       MathExpression$Builder
                                                       MathExpressionOptions$Builder
                                                       MathExpressionProps$Builder
                                                       Metric$Builder
                                                       MetricConfig$Builder
                                                       MetricExpressionConfig$Builder
                                                       MetricOptions$Builder
                                                       MetricProps$Builder
                                                       MetricStatConfig$Builder
                                                       MetricWidgetProps$Builder
                                                       PeriodOverride
                                                       SearchComponents$Builder
                                                       Shading
                                                       SingleValueWidget$Builder
                                                       SingleValueWidgetProps$Builder
                                                       Spacer$Builder
                                                       SpacerProps$Builder
                                                       TableLayout
                                                       TableSummaryColumn
                                                       TableSummaryProps$Builder
                                                       TableWidget$Builder
                                                       TableWidgetProps$Builder
                                                       TextWidget$Builder
                                                       TextWidgetBackground
                                                       TextWidgetProps$Builder
                                                       TreatMissingData
                                                       Unit
                                                       VariableInputType
                                                       VariableType
                                                       VariableValue$Builder
                                                       VerticalAnnotation$Builder
                                                       VerticalShading
                                                       YAxisProps$Builder]))


(defn alarm-state
  "The `alarm-state` function data interprets values in the provided config data into a 
`AlarmState` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `AlarmState` - the value is returned.
* is `:ok` - `AlarmState/OK` is returned
* is `:insufficient-data` - `AlarmState/INSUFFICIENT_DATA` is returned
* is `:alarm` - `AlarmState/ALARM` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? AlarmState data) data
      (= :ok data) AlarmState/OK
      (= :insufficient-data data) AlarmState/INSUFFICIENT_DATA
      (= :alarm data) AlarmState/ALARM)))


(defn alarm-status-widget-sort-by
  "The `alarm-status-widget-sort-by` function data interprets values in the provided config data into a 
`AlarmStatusWidgetSortBy` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `AlarmStatusWidgetSortBy` - the value is returned.
* is `:default` - `AlarmStatusWidgetSortBy/DEFAULT` is returned
* is `:state-updated-timestamp` - `AlarmStatusWidgetSortBy/STATE_UPDATED_TIMESTAMP` is returned
* is `:timestamp` - `AlarmStatusWidgetSortBy/TIMESTAMP` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? AlarmStatusWidgetSortBy data) data
      (= :default data) AlarmStatusWidgetSortBy/DEFAULT
      (= :state-updated-timestamp data) AlarmStatusWidgetSortBy/STATE_UPDATED_TIMESTAMP
      (= :timestamp data) AlarmStatusWidgetSortBy/TIMESTAMP)))


(defn comparison-operator
  "The `comparison-operator` function data interprets values in the provided config data into a 
`ComparisonOperator` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ComparisonOperator` - the value is returned.
* is `:greater-than-upper-threshold` - `ComparisonOperator/GREATER_THAN_UPPER_THRESHOLD` is returned
* is `:less-than-lower-or-greater-than-upper-threshold` - `ComparisonOperator/LESS_THAN_LOWER_OR_GREATER_THAN_UPPER_THRESHOLD` is returned
* is `:less-than-lower-threshold` - `ComparisonOperator/LESS_THAN_LOWER_THRESHOLD` is returned
* is `:greater-than-threshold` - `ComparisonOperator/GREATER_THAN_THRESHOLD` is returned
* is `:less-than-threshold` - `ComparisonOperator/LESS_THAN_THRESHOLD` is returned
* is `:greater-than-or-equal-to-threshold` - `ComparisonOperator/GREATER_THAN_OR_EQUAL_TO_THRESHOLD` is returned
* is `:less-than-or-equal-to-threshold` - `ComparisonOperator/LESS_THAN_OR_EQUAL_TO_THRESHOLD` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ComparisonOperator data) data
      (= :greater-than-upper-threshold data) ComparisonOperator/GREATER_THAN_UPPER_THRESHOLD
      (= :less-than-lower-or-greater-than-upper-threshold data) ComparisonOperator/LESS_THAN_LOWER_OR_GREATER_THAN_UPPER_THRESHOLD
      (= :less-than-lower-threshold data) ComparisonOperator/LESS_THAN_LOWER_THRESHOLD
      (= :greater-than-threshold data) ComparisonOperator/GREATER_THAN_THRESHOLD
      (= :less-than-threshold data) ComparisonOperator/LESS_THAN_THRESHOLD
      (= :greater-than-or-equal-to-threshold data) ComparisonOperator/GREATER_THAN_OR_EQUAL_TO_THRESHOLD
      (= :less-than-or-equal-to-threshold data) ComparisonOperator/LESS_THAN_OR_EQUAL_TO_THRESHOLD)))


(defn graph-widget-view
  "The `graph-widget-view` function data interprets values in the provided config data into a 
`GraphWidgetView` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `GraphWidgetView` - the value is returned.
* is `:time-series` - `GraphWidgetView/TIME_SERIES` is returned
* is `:pie` - `GraphWidgetView/PIE` is returned
* is `:bar` - `GraphWidgetView/BAR` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? GraphWidgetView data) data
      (= :time-series data) GraphWidgetView/TIME_SERIES
      (= :pie data) GraphWidgetView/PIE
      (= :bar data) GraphWidgetView/BAR)))


(defn legend-position
  "The `legend-position` function data interprets values in the provided config data into a 
`LegendPosition` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `LegendPosition` - the value is returned.
* is `:bottom` - `LegendPosition/BOTTOM` is returned
* is `:hidden` - `LegendPosition/HIDDEN` is returned
* is `:right` - `LegendPosition/RIGHT` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? LegendPosition data) data
      (= :bottom data) LegendPosition/BOTTOM
      (= :hidden data) LegendPosition/HIDDEN
      (= :right data) LegendPosition/RIGHT)))


(defn log-query-visualization-type
  "The `log-query-visualization-type` function data interprets values in the provided config data into a 
`LogQueryVisualizationType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `LogQueryVisualizationType` - the value is returned.
* is `:stackedarea` - `LogQueryVisualizationType/STACKEDAREA` is returned
* is `:bar` - `LogQueryVisualizationType/BAR` is returned
* is `:line` - `LogQueryVisualizationType/LINE` is returned
* is `:table` - `LogQueryVisualizationType/TABLE` is returned
* is `:pie` - `LogQueryVisualizationType/PIE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? LogQueryVisualizationType data) data
      (= :stackedarea data) LogQueryVisualizationType/STACKEDAREA
      (= :bar data) LogQueryVisualizationType/BAR
      (= :line data) LogQueryVisualizationType/LINE
      (= :table data) LogQueryVisualizationType/TABLE
      (= :pie data) LogQueryVisualizationType/PIE)))


(defn period-override
  "The `period-override` function data interprets values in the provided config data into a 
`PeriodOverride` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `PeriodOverride` - the value is returned.
* is `:auto` - `PeriodOverride/AUTO` is returned
* is `:inherit` - `PeriodOverride/INHERIT` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? PeriodOverride data) data
      (= :auto data) PeriodOverride/AUTO
      (= :inherit data) PeriodOverride/INHERIT)))


(defn shading
  "The `shading` function data interprets values in the provided config data into a 
`Shading` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `Shading` - the value is returned.
* is `:none` - `Shading/NONE` is returned
* is `:above` - `Shading/ABOVE` is returned
* is `:below` - `Shading/BELOW` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? Shading data) data
      (= :none data) Shading/NONE
      (= :above data) Shading/ABOVE
      (= :below data) Shading/BELOW)))


(defn table-layout
  "The `table-layout` function data interprets values in the provided config data into a 
`TableLayout` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `TableLayout` - the value is returned.
* is `:horizontal` - `TableLayout/HORIZONTAL` is returned
* is `:vertical` - `TableLayout/VERTICAL` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? TableLayout data) data
      (= :horizontal data) TableLayout/HORIZONTAL
      (= :vertical data) TableLayout/VERTICAL)))


(defn table-summary-column
  "The `table-summary-column` function data interprets values in the provided config data into a 
`TableSummaryColumn` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `TableSummaryColumn` - the value is returned.
* is `:sum` - `TableSummaryColumn/SUM` is returned
* is `:maximum` - `TableSummaryColumn/MAXIMUM` is returned
* is `:average` - `TableSummaryColumn/AVERAGE` is returned
* is `:minimum` - `TableSummaryColumn/MINIMUM` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? TableSummaryColumn data) data
      (= :sum data) TableSummaryColumn/SUM
      (= :maximum data) TableSummaryColumn/MAXIMUM
      (= :average data) TableSummaryColumn/AVERAGE
      (= :minimum data) TableSummaryColumn/MINIMUM)))


(defn text-widget-background
  "The `text-widget-background` function data interprets values in the provided config data into a 
`TextWidgetBackground` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `TextWidgetBackground` - the value is returned.
* is `:transparent` - `TextWidgetBackground/TRANSPARENT` is returned
* is `:solid` - `TextWidgetBackground/SOLID` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? TextWidgetBackground data) data
      (= :transparent data) TextWidgetBackground/TRANSPARENT
      (= :solid data) TextWidgetBackground/SOLID)))


(defn treat-missing-data
  "The `treat-missing-data` function data interprets values in the provided config data into a 
`TreatMissingData` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `TreatMissingData` - the value is returned.
* is `:ignore` - `TreatMissingData/IGNORE` is returned
* is `:not-breaching` - `TreatMissingData/NOT_BREACHING` is returned
* is `:missing` - `TreatMissingData/MISSING` is returned
* is `:breaching` - `TreatMissingData/BREACHING` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? TreatMissingData data) data
      (= :ignore data) TreatMissingData/IGNORE
      (= :not-breaching data) TreatMissingData/NOT_BREACHING
      (= :missing data) TreatMissingData/MISSING
      (= :breaching data) TreatMissingData/BREACHING)))


(defn unit
  "The `unit` function data interprets values in the provided config data into a 
`Unit` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `Unit` - the value is returned.
* is `:megabits-per-second` - `Unit/MEGABITS_PER_SECOND` is returned
* is `:terabits-per-second` - `Unit/TERABITS_PER_SECOND` is returned
* is `:gigabits` - `Unit/GIGABITS` is returned
* is `:terabytes` - `Unit/TERABYTES` is returned
* is `:kilobits-per-second` - `Unit/KILOBITS_PER_SECOND` is returned
* is `:kilobytes` - `Unit/KILOBYTES` is returned
* is `:count` - `Unit/COUNT` is returned
* is `:milliseconds` - `Unit/MILLISECONDS` is returned
* is `:megabytes-per-second` - `Unit/MEGABYTES_PER_SECOND` is returned
* is `:terabytes-per-second` - `Unit/TERABYTES_PER_SECOND` is returned
* is `:percent` - `Unit/PERCENT` is returned
* is `:megabits` - `Unit/MEGABITS` is returned
* is `:count-per-second` - `Unit/COUNT_PER_SECOND` is returned
* is `:none` - `Unit/NONE` is returned
* is `:microseconds` - `Unit/MICROSECONDS` is returned
* is `:megabytes` - `Unit/MEGABYTES` is returned
* is `:kilobits` - `Unit/KILOBITS` is returned
* is `:bytes` - `Unit/BYTES` is returned
* is `:seconds` - `Unit/SECONDS` is returned
* is `:kilobytes-per-second` - `Unit/KILOBYTES_PER_SECOND` is returned
* is `:gigabytes-per-second` - `Unit/GIGABYTES_PER_SECOND` is returned
* is `:bytes-per-second` - `Unit/BYTES_PER_SECOND` is returned
* is `:bits-per-second` - `Unit/BITS_PER_SECOND` is returned
* is `:terabits` - `Unit/TERABITS` is returned
* is `:gigabytes` - `Unit/GIGABYTES` is returned
* is `:gigabits-per-second` - `Unit/GIGABITS_PER_SECOND` is returned
* is `:bits` - `Unit/BITS` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? Unit data) data
      (= :megabits-per-second data) Unit/MEGABITS_PER_SECOND
      (= :terabits-per-second data) Unit/TERABITS_PER_SECOND
      (= :gigabits data) Unit/GIGABITS
      (= :terabytes data) Unit/TERABYTES
      (= :kilobits-per-second data) Unit/KILOBITS_PER_SECOND
      (= :kilobytes data) Unit/KILOBYTES
      (= :count data) Unit/COUNT
      (= :milliseconds data) Unit/MILLISECONDS
      (= :megabytes-per-second data) Unit/MEGABYTES_PER_SECOND
      (= :terabytes-per-second data) Unit/TERABYTES_PER_SECOND
      (= :percent data) Unit/PERCENT
      (= :megabits data) Unit/MEGABITS
      (= :count-per-second data) Unit/COUNT_PER_SECOND
      (= :none data) Unit/NONE
      (= :microseconds data) Unit/MICROSECONDS
      (= :megabytes data) Unit/MEGABYTES
      (= :kilobits data) Unit/KILOBITS
      (= :bytes data) Unit/BYTES
      (= :seconds data) Unit/SECONDS
      (= :kilobytes-per-second data) Unit/KILOBYTES_PER_SECOND
      (= :gigabytes-per-second data) Unit/GIGABYTES_PER_SECOND
      (= :bytes-per-second data) Unit/BYTES_PER_SECOND
      (= :bits-per-second data) Unit/BITS_PER_SECOND
      (= :terabits data) Unit/TERABITS
      (= :gigabytes data) Unit/GIGABYTES
      (= :gigabits-per-second data) Unit/GIGABITS_PER_SECOND
      (= :bits data) Unit/BITS)))


(defn variable-input-type
  "The `variable-input-type` function data interprets values in the provided config data into a 
`VariableInputType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `VariableInputType` - the value is returned.
* is `:input` - `VariableInputType/INPUT` is returned
* is `:select` - `VariableInputType/SELECT` is returned
* is `:radio` - `VariableInputType/RADIO` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? VariableInputType data) data
      (= :input data) VariableInputType/INPUT
      (= :select data) VariableInputType/SELECT
      (= :radio data) VariableInputType/RADIO)))


(defn variable-type
  "The `variable-type` function data interprets values in the provided config data into a 
`VariableType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `VariableType` - the value is returned.
* is `:pattern` - `VariableType/PATTERN` is returned
* is `:property` - `VariableType/PROPERTY` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? VariableType data) data
      (= :pattern data) VariableType/PATTERN
      (= :property data) VariableType/PROPERTY)))


(defn vertical-shading
  "The `vertical-shading` function data interprets values in the provided config data into a 
`VerticalShading` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `VerticalShading` - the value is returned.
* is `:before` - `VerticalShading/BEFORE` is returned
* is `:after` - `VerticalShading/AFTER` is returned
* is `:none` - `VerticalShading/NONE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? VerticalShading data) data
      (= :before data) VerticalShading/BEFORE
      (= :after data) VerticalShading/AFTER
      (= :none data) VerticalShading/NONE)))


(defn alarm-action-config-builder>
  "The alarm-action-config-builder> function updates a AlarmActionConfig$Builder instance using the provided configuration.
  The function takes the AlarmActionConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarmActionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-action-arn` |
"
  [^AlarmActionConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :alarm-action-arn)]
    (. builder alarmActionArn data))
  (.build builder))


(defn alarm-action-config-builder
  "Creates a  `AlarmActionConfig$Builder` instance using a no-argument constructor, applies the data configuration using the [[alarm-action-config-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (alarm-action-config-builder> (new AlarmActionConfig$Builder) id config))


(defn alarm-builder>
  "The alarm-builder> function updates a Alarm$Builder instance using the provided configuration.
  The function takes the Alarm$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:actions-enabled` |
| `alarmDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-description` |
| `alarmName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-name` |
| `comparisonOperator` | software.amazon.awscdk.services.cloudwatch.ComparisonOperator | [[cdk.api.services.cloudwatch/comparison-operator]] | `:comparison-operator` |
| `datapointsToAlarm` | java.lang.Number | [[cdk.support/lookup-entry]] | `:datapoints-to-alarm` |
| `evaluateLowSampleCountPercentile` | java.lang.String | [[cdk.support/lookup-entry]] | `:evaluate-low-sample-count-percentile` |
| `evaluationPeriods` | java.lang.Number | [[cdk.support/lookup-entry]] | `:evaluation-periods` |
| `metric` | software.amazon.awscdk.services.cloudwatch.IMetric | [[cdk.support/lookup-entry]] | `:metric` |
| `threshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:threshold` |
| `treatMissingData` | software.amazon.awscdk.services.cloudwatch.TreatMissingData | [[cdk.api.services.cloudwatch/treat-missing-data]] | `:treat-missing-data` |
"
  [^Alarm$Builder builder id config]
  (when-some [data (lookup-entry config id :actions-enabled)]
    (. builder actionsEnabled data))
  (when-some [data (lookup-entry config id :alarm-description)]
    (. builder alarmDescription data))
  (when-some [data (lookup-entry config id :alarm-name)]
    (. builder alarmName data))
  (when-some [data (comparison-operator config id :comparison-operator)]
    (. builder comparisonOperator data))
  (when-some [data (lookup-entry config id :datapoints-to-alarm)]
    (. builder datapointsToAlarm data))
  (when-some [data (lookup-entry config id :evaluate-low-sample-count-percentile)]
    (. builder evaluateLowSampleCountPercentile data))
  (when-some [data (lookup-entry config id :evaluation-periods)]
    (. builder evaluationPeriods data))
  (when-some [data (lookup-entry config id :metric)]
    (. builder metric data))
  (when-some [data (lookup-entry config id :threshold)]
    (. builder threshold data))
  (when-some [data (treat-missing-data config id :treat-missing-data)]
    (. builder treatMissingData data))
  (.build builder))


(defn alarm-builder
  "Creates a  `Alarm$Builder` instance using a scope and ID, applies the data configuration using the [[alarm-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (alarm-builder> (Alarm$Builder/create scope (name id)) id config))


(defn alarm-props-builder>
  "The alarm-props-builder> function updates a AlarmProps$Builder instance using the provided configuration.
  The function takes the AlarmProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:actions-enabled` |
| `alarmDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-description` |
| `alarmName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-name` |
| `comparisonOperator` | software.amazon.awscdk.services.cloudwatch.ComparisonOperator | [[cdk.api.services.cloudwatch/comparison-operator]] | `:comparison-operator` |
| `datapointsToAlarm` | java.lang.Number | [[cdk.support/lookup-entry]] | `:datapoints-to-alarm` |
| `evaluateLowSampleCountPercentile` | java.lang.String | [[cdk.support/lookup-entry]] | `:evaluate-low-sample-count-percentile` |
| `evaluationPeriods` | java.lang.Number | [[cdk.support/lookup-entry]] | `:evaluation-periods` |
| `metric` | software.amazon.awscdk.services.cloudwatch.IMetric | [[cdk.support/lookup-entry]] | `:metric` |
| `threshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:threshold` |
| `treatMissingData` | software.amazon.awscdk.services.cloudwatch.TreatMissingData | [[cdk.api.services.cloudwatch/treat-missing-data]] | `:treat-missing-data` |
"
  [^AlarmProps$Builder builder id config]
  (when-some [data (lookup-entry config id :actions-enabled)]
    (. builder actionsEnabled data))
  (when-some [data (lookup-entry config id :alarm-description)]
    (. builder alarmDescription data))
  (when-some [data (lookup-entry config id :alarm-name)]
    (. builder alarmName data))
  (when-some [data (comparison-operator config id :comparison-operator)]
    (. builder comparisonOperator data))
  (when-some [data (lookup-entry config id :datapoints-to-alarm)]
    (. builder datapointsToAlarm data))
  (when-some [data (lookup-entry config id :evaluate-low-sample-count-percentile)]
    (. builder evaluateLowSampleCountPercentile data))
  (when-some [data (lookup-entry config id :evaluation-periods)]
    (. builder evaluationPeriods data))
  (when-some [data (lookup-entry config id :metric)]
    (. builder metric data))
  (when-some [data (lookup-entry config id :threshold)]
    (. builder threshold data))
  (when-some [data (treat-missing-data config id :treat-missing-data)]
    (. builder treatMissingData data))
  (.build builder))


(defn alarm-props-builder
  "Creates a  `AlarmProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[alarm-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (alarm-props-builder> (new AlarmProps$Builder) id config))


(defn alarm-status-widget-builder>
  "The alarm-status-widget-builder> function updates a AlarmStatusWidget$Builder instance using the provided configuration.
  The function takes the AlarmStatusWidget$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarms` | java.util.List | [[cdk.support/lookup-entry]] | `:alarms` |
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `sortBy` | software.amazon.awscdk.services.cloudwatch.AlarmStatusWidgetSortBy | [[cdk.api.services.cloudwatch/alarm-status-widget-sort-by]] | `:sort-by` |
| `states` | java.util.List | [[cdk.support/lookup-entry]] | `:states` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |
"
  [^AlarmStatusWidget$Builder builder id config]
  (when-some [data (lookup-entry config id :alarms)]
    (. builder alarms data))
  (when-some [data (lookup-entry config id :height)]
    (. builder height data))
  (when-some [data (alarm-status-widget-sort-by config id :sort-by)]
    (. builder sortBy data))
  (when-some [data (lookup-entry config id :states)]
    (. builder states data))
  (when-some [data (lookup-entry config id :title)]
    (. builder title data))
  (when-some [data (lookup-entry config id :width)]
    (. builder width data))
  (.build builder))


(defn alarm-status-widget-builder
  "Creates a  `AlarmStatusWidget$Builder` instance using a no-argument create, applies the data configuration using the [[alarm-status-widget-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (alarm-status-widget-builder> (AlarmStatusWidget$Builder/create) id config))


(defn alarm-status-widget-props-builder>
  "The alarm-status-widget-props-builder> function updates a AlarmStatusWidgetProps$Builder instance using the provided configuration.
  The function takes the AlarmStatusWidgetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarms` | java.util.List | [[cdk.support/lookup-entry]] | `:alarms` |
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `sortBy` | software.amazon.awscdk.services.cloudwatch.AlarmStatusWidgetSortBy | [[cdk.api.services.cloudwatch/alarm-status-widget-sort-by]] | `:sort-by` |
| `states` | java.util.List | [[cdk.support/lookup-entry]] | `:states` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |
"
  [^AlarmStatusWidgetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :alarms)]
    (. builder alarms data))
  (when-some [data (lookup-entry config id :height)]
    (. builder height data))
  (when-some [data (alarm-status-widget-sort-by config id :sort-by)]
    (. builder sortBy data))
  (when-some [data (lookup-entry config id :states)]
    (. builder states data))
  (when-some [data (lookup-entry config id :title)]
    (. builder title data))
  (when-some [data (lookup-entry config id :width)]
    (. builder width data))
  (.build builder))


(defn alarm-status-widget-props-builder
  "Creates a  `AlarmStatusWidgetProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[alarm-status-widget-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (alarm-status-widget-props-builder> (new AlarmStatusWidgetProps$Builder) id config))


(defn alarm-widget-builder>
  "The alarm-widget-builder> function updates a AlarmWidget$Builder instance using the provided configuration.
  The function takes the AlarmWidget$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarm` | software.amazon.awscdk.services.cloudwatch.IAlarm | [[cdk.support/lookup-entry]] | `:alarm` |
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `leftYAxis` | software.amazon.awscdk.services.cloudwatch.YAxisProps | [[cdk.support/lookup-entry]] | `:left-y-axis` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |
"
  [^AlarmWidget$Builder builder id config]
  (when-some [data (lookup-entry config id :alarm)]
    (. builder alarm data))
  (when-some [data (lookup-entry config id :height)]
    (. builder height data))
  (when-some [data (lookup-entry config id :left-y-axis)]
    (. builder leftYAxis data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :title)]
    (. builder title data))
  (when-some [data (lookup-entry config id :width)]
    (. builder width data))
  (.build builder))


(defn alarm-widget-builder
  "Creates a  `AlarmWidget$Builder` instance using a no-argument create, applies the data configuration using the [[alarm-widget-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (alarm-widget-builder> (AlarmWidget$Builder/create) id config))


(defn alarm-widget-props-builder>
  "The alarm-widget-props-builder> function updates a AlarmWidgetProps$Builder instance using the provided configuration.
  The function takes the AlarmWidgetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarm` | software.amazon.awscdk.services.cloudwatch.IAlarm | [[cdk.support/lookup-entry]] | `:alarm` |
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `leftYAxis` | software.amazon.awscdk.services.cloudwatch.YAxisProps | [[cdk.support/lookup-entry]] | `:left-y-axis` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |
"
  [^AlarmWidgetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :alarm)]
    (. builder alarm data))
  (when-some [data (lookup-entry config id :height)]
    (. builder height data))
  (when-some [data (lookup-entry config id :left-y-axis)]
    (. builder leftYAxis data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :title)]
    (. builder title data))
  (when-some [data (lookup-entry config id :width)]
    (. builder width data))
  (.build builder))


(defn alarm-widget-props-builder
  "Creates a  `AlarmWidgetProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[alarm-widget-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (alarm-widget-props-builder> (new AlarmWidgetProps$Builder) id config))


(defn cfn-alarm-builder>
  "The cfn-alarm-builder> function updates a CfnAlarm$Builder instance using the provided configuration.
  The function takes the CfnAlarm$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:actions-enabled` |
| `alarmActions` | java.util.List | [[cdk.support/lookup-entry]] | `:alarm-actions` |
| `alarmDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-description` |
| `alarmName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-name` |
| `comparisonOperator` | java.lang.String | [[cdk.support/lookup-entry]] | `:comparison-operator` |
| `datapointsToAlarm` | java.lang.Number | [[cdk.support/lookup-entry]] | `:datapoints-to-alarm` |
| `dimensions` | java.util.List | [[cdk.support/lookup-entry]] | `:dimensions` |
| `evaluateLowSampleCountPercentile` | java.lang.String | [[cdk.support/lookup-entry]] | `:evaluate-low-sample-count-percentile` |
| `evaluationPeriods` | java.lang.Number | [[cdk.support/lookup-entry]] | `:evaluation-periods` |
| `extendedStatistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:extended-statistic` |
| `insufficientDataActions` | java.util.List | [[cdk.support/lookup-entry]] | `:insufficient-data-actions` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `metrics` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:metrics` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `okActions` | java.util.List | [[cdk.support/lookup-entry]] | `:ok-actions` |
| `period` | java.lang.Number | [[cdk.support/lookup-entry]] | `:period` |
| `statistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:statistic` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `threshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:threshold` |
| `thresholdMetricId` | java.lang.String | [[cdk.support/lookup-entry]] | `:threshold-metric-id` |
| `treatMissingData` | java.lang.String | [[cdk.support/lookup-entry]] | `:treat-missing-data` |
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
"
  [^CfnAlarm$Builder builder id config]
  (when-some [data (lookup-entry config id :actions-enabled)]
    (. builder actionsEnabled data))
  (when-some [data (lookup-entry config id :alarm-actions)]
    (. builder alarmActions data))
  (when-some [data (lookup-entry config id :alarm-description)]
    (. builder alarmDescription data))
  (when-some [data (lookup-entry config id :alarm-name)]
    (. builder alarmName data))
  (when-some [data (lookup-entry config id :comparison-operator)]
    (. builder comparisonOperator data))
  (when-some [data (lookup-entry config id :datapoints-to-alarm)]
    (. builder datapointsToAlarm data))
  (when-some [data (lookup-entry config id :dimensions)]
    (. builder dimensions data))
  (when-some [data (lookup-entry config id :evaluate-low-sample-count-percentile)]
    (. builder evaluateLowSampleCountPercentile data))
  (when-some [data (lookup-entry config id :evaluation-periods)]
    (. builder evaluationPeriods data))
  (when-some [data (lookup-entry config id :extended-statistic)]
    (. builder extendedStatistic data))
  (when-some [data (lookup-entry config id :insufficient-data-actions)]
    (. builder insufficientDataActions data))
  (when-some [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-some [data (lookup-entry config id :metrics)]
    (. builder metrics data))
  (when-some [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (when-some [data (lookup-entry config id :ok-actions)]
    (. builder okActions data))
  (when-some [data (lookup-entry config id :period)]
    (. builder period data))
  (when-some [data (lookup-entry config id :statistic)]
    (. builder statistic data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :threshold)]
    (. builder threshold data))
  (when-some [data (lookup-entry config id :threshold-metric-id)]
    (. builder thresholdMetricId data))
  (when-some [data (lookup-entry config id :treat-missing-data)]
    (. builder treatMissingData data))
  (when-some [data (lookup-entry config id :unit)]
    (. builder unit data))
  (.build builder))


(defn cfn-alarm-builder
  "Creates a  `CfnAlarm$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-alarm-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-alarm-builder> (CfnAlarm$Builder/create scope (name id)) id config))


(defn cfn-alarm-dimension-property-builder>
  "The cfn-alarm-dimension-property-builder> function updates a CfnAlarm$DimensionProperty$Builder instance using the provided configuration.
  The function takes the CfnAlarm$DimensionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnAlarm$DimensionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-alarm-dimension-property-builder
  "Creates a  `CfnAlarm$DimensionProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-alarm-dimension-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-alarm-dimension-property-builder> (new CfnAlarm$DimensionProperty$Builder) id config))


(defn cfn-alarm-metric-data-query-property-builder>
  "The cfn-alarm-metric-data-query-property-builder> function updates a CfnAlarm$MetricDataQueryProperty$Builder instance using the provided configuration.
  The function takes the CfnAlarm$MetricDataQueryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `label` | java.lang.String | [[cdk.support/lookup-entry]] | `:label` |
| `metricStat` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:metric-stat` |
| `period` | java.lang.Number | [[cdk.support/lookup-entry]] | `:period` |
| `returnData` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:return-data` |
"
  [^CfnAlarm$MetricDataQueryProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :account-id)]
    (. builder accountId data))
  (when-some [data (lookup-entry config id :expression)]
    (. builder expression data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :label)]
    (. builder label data))
  (when-some [data (lookup-entry config id :metric-stat)]
    (. builder metricStat data))
  (when-some [data (lookup-entry config id :period)]
    (. builder period data))
  (when-some [data (lookup-entry config id :return-data)]
    (. builder returnData data))
  (.build builder))


(defn cfn-alarm-metric-data-query-property-builder
  "Creates a  `CfnAlarm$MetricDataQueryProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-alarm-metric-data-query-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-alarm-metric-data-query-property-builder> (new CfnAlarm$MetricDataQueryProperty$Builder) id config))


(defn cfn-alarm-metric-property-builder>
  "The cfn-alarm-metric-property-builder> function updates a CfnAlarm$MetricProperty$Builder instance using the provided configuration.
  The function takes the CfnAlarm$MetricProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimensions` | java.util.List | [[cdk.support/lookup-entry]] | `:dimensions` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
"
  [^CfnAlarm$MetricProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :dimensions)]
    (. builder dimensions data))
  (when-some [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-some [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (.build builder))


(defn cfn-alarm-metric-property-builder
  "Creates a  `CfnAlarm$MetricProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-alarm-metric-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-alarm-metric-property-builder> (new CfnAlarm$MetricProperty$Builder) id config))


(defn cfn-alarm-metric-stat-property-builder>
  "The cfn-alarm-metric-stat-property-builder> function updates a CfnAlarm$MetricStatProperty$Builder instance using the provided configuration.
  The function takes the CfnAlarm$MetricStatProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metric` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:metric` |
| `period` | java.lang.Number | [[cdk.support/lookup-entry]] | `:period` |
| `stat` | java.lang.String | [[cdk.support/lookup-entry]] | `:stat` |
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
"
  [^CfnAlarm$MetricStatProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :metric)]
    (. builder metric data))
  (when-some [data (lookup-entry config id :period)]
    (. builder period data))
  (when-some [data (lookup-entry config id :stat)]
    (. builder stat data))
  (when-some [data (lookup-entry config id :unit)]
    (. builder unit data))
  (.build builder))


(defn cfn-alarm-metric-stat-property-builder
  "Creates a  `CfnAlarm$MetricStatProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-alarm-metric-stat-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-alarm-metric-stat-property-builder> (new CfnAlarm$MetricStatProperty$Builder) id config))


(defn cfn-alarm-props-builder>
  "The cfn-alarm-props-builder> function updates a CfnAlarmProps$Builder instance using the provided configuration.
  The function takes the CfnAlarmProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:actions-enabled` |
| `alarmActions` | java.util.List | [[cdk.support/lookup-entry]] | `:alarm-actions` |
| `alarmDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-description` |
| `alarmName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-name` |
| `comparisonOperator` | java.lang.String | [[cdk.support/lookup-entry]] | `:comparison-operator` |
| `datapointsToAlarm` | java.lang.Number | [[cdk.support/lookup-entry]] | `:datapoints-to-alarm` |
| `dimensions` | java.util.List | [[cdk.support/lookup-entry]] | `:dimensions` |
| `evaluateLowSampleCountPercentile` | java.lang.String | [[cdk.support/lookup-entry]] | `:evaluate-low-sample-count-percentile` |
| `evaluationPeriods` | java.lang.Number | [[cdk.support/lookup-entry]] | `:evaluation-periods` |
| `extendedStatistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:extended-statistic` |
| `insufficientDataActions` | java.util.List | [[cdk.support/lookup-entry]] | `:insufficient-data-actions` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `metrics` | java.util.List | [[cdk.support/lookup-entry]] | `:metrics` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `okActions` | java.util.List | [[cdk.support/lookup-entry]] | `:ok-actions` |
| `period` | java.lang.Number | [[cdk.support/lookup-entry]] | `:period` |
| `statistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:statistic` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `threshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:threshold` |
| `thresholdMetricId` | java.lang.String | [[cdk.support/lookup-entry]] | `:threshold-metric-id` |
| `treatMissingData` | java.lang.String | [[cdk.support/lookup-entry]] | `:treat-missing-data` |
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
"
  [^CfnAlarmProps$Builder builder id config]
  (when-some [data (lookup-entry config id :actions-enabled)]
    (. builder actionsEnabled data))
  (when-some [data (lookup-entry config id :alarm-actions)]
    (. builder alarmActions data))
  (when-some [data (lookup-entry config id :alarm-description)]
    (. builder alarmDescription data))
  (when-some [data (lookup-entry config id :alarm-name)]
    (. builder alarmName data))
  (when-some [data (lookup-entry config id :comparison-operator)]
    (. builder comparisonOperator data))
  (when-some [data (lookup-entry config id :datapoints-to-alarm)]
    (. builder datapointsToAlarm data))
  (when-some [data (lookup-entry config id :dimensions)]
    (. builder dimensions data))
  (when-some [data (lookup-entry config id :evaluate-low-sample-count-percentile)]
    (. builder evaluateLowSampleCountPercentile data))
  (when-some [data (lookup-entry config id :evaluation-periods)]
    (. builder evaluationPeriods data))
  (when-some [data (lookup-entry config id :extended-statistic)]
    (. builder extendedStatistic data))
  (when-some [data (lookup-entry config id :insufficient-data-actions)]
    (. builder insufficientDataActions data))
  (when-some [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-some [data (lookup-entry config id :metrics)]
    (. builder metrics data))
  (when-some [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (when-some [data (lookup-entry config id :ok-actions)]
    (. builder okActions data))
  (when-some [data (lookup-entry config id :period)]
    (. builder period data))
  (when-some [data (lookup-entry config id :statistic)]
    (. builder statistic data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :threshold)]
    (. builder threshold data))
  (when-some [data (lookup-entry config id :threshold-metric-id)]
    (. builder thresholdMetricId data))
  (when-some [data (lookup-entry config id :treat-missing-data)]
    (. builder treatMissingData data))
  (when-some [data (lookup-entry config id :unit)]
    (. builder unit data))
  (.build builder))


(defn cfn-alarm-props-builder
  "Creates a  `CfnAlarmProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-alarm-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-alarm-props-builder> (new CfnAlarmProps$Builder) id config))


(defn cfn-anomaly-detector-builder>
  "The cfn-anomaly-detector-builder> function updates a CfnAnomalyDetector$Builder instance using the provided configuration.
  The function takes the CfnAnomalyDetector$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configuration` |
| `dimensions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dimensions` |
| `metricCharacteristics` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:metric-characteristics` |
| `metricMathAnomalyDetector` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:metric-math-anomaly-detector` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `singleMetricAnomalyDetector` | software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector$SingleMetricAnomalyDetectorProperty | [[cdk.support/lookup-entry]] | `:single-metric-anomaly-detector` |
| `stat` | java.lang.String | [[cdk.support/lookup-entry]] | `:stat` |
"
  [^CfnAnomalyDetector$Builder builder id config]
  (when-some [data (lookup-entry config id :configuration)]
    (. builder configuration data))
  (when-some [data (lookup-entry config id :dimensions)]
    (. builder dimensions data))
  (when-some [data (lookup-entry config id :metric-characteristics)]
    (. builder metricCharacteristics data))
  (when-some [data (lookup-entry config id :metric-math-anomaly-detector)]
    (. builder metricMathAnomalyDetector data))
  (when-some [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-some [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (when-some [data (lookup-entry config id :single-metric-anomaly-detector)]
    (. builder singleMetricAnomalyDetector data))
  (when-some [data (lookup-entry config id :stat)]
    (. builder stat data))
  (.build builder))


(defn cfn-anomaly-detector-builder
  "Creates a  `CfnAnomalyDetector$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-anomaly-detector-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-anomaly-detector-builder> (CfnAnomalyDetector$Builder/create scope (name id)) id config))


(defn cfn-anomaly-detector-configuration-property-builder>
  "The cfn-anomaly-detector-configuration-property-builder> function updates a CfnAnomalyDetector$ConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnAnomalyDetector$ConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludedTimeRanges` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:excluded-time-ranges` |
| `metricTimeZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-time-zone` |
"
  [^CfnAnomalyDetector$ConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :excluded-time-ranges)]
    (. builder excludedTimeRanges data))
  (when-some [data (lookup-entry config id :metric-time-zone)]
    (. builder metricTimeZone data))
  (.build builder))


(defn cfn-anomaly-detector-configuration-property-builder
  "Creates a  `CfnAnomalyDetector$ConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-anomaly-detector-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-anomaly-detector-configuration-property-builder> (new CfnAnomalyDetector$ConfigurationProperty$Builder) id config))


(defn cfn-anomaly-detector-dimension-property-builder>
  "The cfn-anomaly-detector-dimension-property-builder> function updates a CfnAnomalyDetector$DimensionProperty$Builder instance using the provided configuration.
  The function takes the CfnAnomalyDetector$DimensionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnAnomalyDetector$DimensionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-anomaly-detector-dimension-property-builder
  "Creates a  `CfnAnomalyDetector$DimensionProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-anomaly-detector-dimension-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-anomaly-detector-dimension-property-builder> (new CfnAnomalyDetector$DimensionProperty$Builder) id config))


(defn cfn-anomaly-detector-metric-characteristics-property-builder>
  "The cfn-anomaly-detector-metric-characteristics-property-builder> function updates a CfnAnomalyDetector$MetricCharacteristicsProperty$Builder instance using the provided configuration.
  The function takes the CfnAnomalyDetector$MetricCharacteristicsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `periodicSpikes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:periodic-spikes` |
"
  [^CfnAnomalyDetector$MetricCharacteristicsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :periodic-spikes)]
    (. builder periodicSpikes data))
  (.build builder))


(defn cfn-anomaly-detector-metric-characteristics-property-builder
  "Creates a  `CfnAnomalyDetector$MetricCharacteristicsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-anomaly-detector-metric-characteristics-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-anomaly-detector-metric-characteristics-property-builder> (new CfnAnomalyDetector$MetricCharacteristicsProperty$Builder) id config))


(defn cfn-anomaly-detector-metric-data-query-property-builder>
  "The cfn-anomaly-detector-metric-data-query-property-builder> function updates a CfnAnomalyDetector$MetricDataQueryProperty$Builder instance using the provided configuration.
  The function takes the CfnAnomalyDetector$MetricDataQueryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `label` | java.lang.String | [[cdk.support/lookup-entry]] | `:label` |
| `metricStat` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:metric-stat` |
| `period` | java.lang.Number | [[cdk.support/lookup-entry]] | `:period` |
| `returnData` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:return-data` |
"
  [^CfnAnomalyDetector$MetricDataQueryProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :account-id)]
    (. builder accountId data))
  (when-some [data (lookup-entry config id :expression)]
    (. builder expression data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :label)]
    (. builder label data))
  (when-some [data (lookup-entry config id :metric-stat)]
    (. builder metricStat data))
  (when-some [data (lookup-entry config id :period)]
    (. builder period data))
  (when-some [data (lookup-entry config id :return-data)]
    (. builder returnData data))
  (.build builder))


(defn cfn-anomaly-detector-metric-data-query-property-builder
  "Creates a  `CfnAnomalyDetector$MetricDataQueryProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-anomaly-detector-metric-data-query-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-anomaly-detector-metric-data-query-property-builder> (new CfnAnomalyDetector$MetricDataQueryProperty$Builder) id config))


(defn cfn-anomaly-detector-metric-math-anomaly-detector-property-builder>
  "The cfn-anomaly-detector-metric-math-anomaly-detector-property-builder> function updates a CfnAnomalyDetector$MetricMathAnomalyDetectorProperty$Builder instance using the provided configuration.
  The function takes the CfnAnomalyDetector$MetricMathAnomalyDetectorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metricDataQueries` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:metric-data-queries` |
"
  [^CfnAnomalyDetector$MetricMathAnomalyDetectorProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :metric-data-queries)]
    (. builder metricDataQueries data))
  (.build builder))


(defn cfn-anomaly-detector-metric-math-anomaly-detector-property-builder
  "Creates a  `CfnAnomalyDetector$MetricMathAnomalyDetectorProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-anomaly-detector-metric-math-anomaly-detector-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-anomaly-detector-metric-math-anomaly-detector-property-builder> (new CfnAnomalyDetector$MetricMathAnomalyDetectorProperty$Builder) id config))


(defn cfn-anomaly-detector-metric-property-builder>
  "The cfn-anomaly-detector-metric-property-builder> function updates a CfnAnomalyDetector$MetricProperty$Builder instance using the provided configuration.
  The function takes the CfnAnomalyDetector$MetricProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimensions` | java.util.List | [[cdk.support/lookup-entry]] | `:dimensions` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
"
  [^CfnAnomalyDetector$MetricProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :dimensions)]
    (. builder dimensions data))
  (when-some [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-some [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (.build builder))


(defn cfn-anomaly-detector-metric-property-builder
  "Creates a  `CfnAnomalyDetector$MetricProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-anomaly-detector-metric-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-anomaly-detector-metric-property-builder> (new CfnAnomalyDetector$MetricProperty$Builder) id config))


(defn cfn-anomaly-detector-metric-stat-property-builder>
  "The cfn-anomaly-detector-metric-stat-property-builder> function updates a CfnAnomalyDetector$MetricStatProperty$Builder instance using the provided configuration.
  The function takes the CfnAnomalyDetector$MetricStatProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metric` | software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector$MetricProperty | [[cdk.support/lookup-entry]] | `:metric` |
| `period` | java.lang.Number | [[cdk.support/lookup-entry]] | `:period` |
| `stat` | java.lang.String | [[cdk.support/lookup-entry]] | `:stat` |
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
"
  [^CfnAnomalyDetector$MetricStatProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :metric)]
    (. builder metric data))
  (when-some [data (lookup-entry config id :period)]
    (. builder period data))
  (when-some [data (lookup-entry config id :stat)]
    (. builder stat data))
  (when-some [data (lookup-entry config id :unit)]
    (. builder unit data))
  (.build builder))


(defn cfn-anomaly-detector-metric-stat-property-builder
  "Creates a  `CfnAnomalyDetector$MetricStatProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-anomaly-detector-metric-stat-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-anomaly-detector-metric-stat-property-builder> (new CfnAnomalyDetector$MetricStatProperty$Builder) id config))


(defn cfn-anomaly-detector-props-builder>
  "The cfn-anomaly-detector-props-builder> function updates a CfnAnomalyDetectorProps$Builder instance using the provided configuration.
  The function takes the CfnAnomalyDetectorProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuration` | software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector$ConfigurationProperty | [[cdk.support/lookup-entry]] | `:configuration` |
| `dimensions` | java.util.List | [[cdk.support/lookup-entry]] | `:dimensions` |
| `metricCharacteristics` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:metric-characteristics` |
| `metricMathAnomalyDetector` | software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector$MetricMathAnomalyDetectorProperty | [[cdk.support/lookup-entry]] | `:metric-math-anomaly-detector` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `singleMetricAnomalyDetector` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:single-metric-anomaly-detector` |
| `stat` | java.lang.String | [[cdk.support/lookup-entry]] | `:stat` |
"
  [^CfnAnomalyDetectorProps$Builder builder id config]
  (when-some [data (lookup-entry config id :configuration)]
    (. builder configuration data))
  (when-some [data (lookup-entry config id :dimensions)]
    (. builder dimensions data))
  (when-some [data (lookup-entry config id :metric-characteristics)]
    (. builder metricCharacteristics data))
  (when-some [data (lookup-entry config id :metric-math-anomaly-detector)]
    (. builder metricMathAnomalyDetector data))
  (when-some [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-some [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (when-some [data (lookup-entry config id :single-metric-anomaly-detector)]
    (. builder singleMetricAnomalyDetector data))
  (when-some [data (lookup-entry config id :stat)]
    (. builder stat data))
  (.build builder))


(defn cfn-anomaly-detector-props-builder
  "Creates a  `CfnAnomalyDetectorProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-anomaly-detector-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-anomaly-detector-props-builder> (new CfnAnomalyDetectorProps$Builder) id config))


(defn cfn-anomaly-detector-range-property-builder>
  "The cfn-anomaly-detector-range-property-builder> function updates a CfnAnomalyDetector$RangeProperty$Builder instance using the provided configuration.
  The function takes the CfnAnomalyDetector$RangeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:end-time` |
| `startTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-time` |
"
  [^CfnAnomalyDetector$RangeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :end-time)]
    (. builder endTime data))
  (when-some [data (lookup-entry config id :start-time)]
    (. builder startTime data))
  (.build builder))


(defn cfn-anomaly-detector-range-property-builder
  "Creates a  `CfnAnomalyDetector$RangeProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-anomaly-detector-range-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-anomaly-detector-range-property-builder> (new CfnAnomalyDetector$RangeProperty$Builder) id config))


(defn cfn-anomaly-detector-single-metric-anomaly-detector-property-builder>
  "The cfn-anomaly-detector-single-metric-anomaly-detector-property-builder> function updates a CfnAnomalyDetector$SingleMetricAnomalyDetectorProperty$Builder instance using the provided configuration.
  The function takes the CfnAnomalyDetector$SingleMetricAnomalyDetectorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `dimensions` | java.util.List | [[cdk.support/lookup-entry]] | `:dimensions` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `stat` | java.lang.String | [[cdk.support/lookup-entry]] | `:stat` |
"
  [^CfnAnomalyDetector$SingleMetricAnomalyDetectorProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :account-id)]
    (. builder accountId data))
  (when-some [data (lookup-entry config id :dimensions)]
    (. builder dimensions data))
  (when-some [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-some [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (when-some [data (lookup-entry config id :stat)]
    (. builder stat data))
  (.build builder))


(defn cfn-anomaly-detector-single-metric-anomaly-detector-property-builder
  "Creates a  `CfnAnomalyDetector$SingleMetricAnomalyDetectorProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-anomaly-detector-single-metric-anomaly-detector-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-anomaly-detector-single-metric-anomaly-detector-property-builder> (new CfnAnomalyDetector$SingleMetricAnomalyDetectorProperty$Builder) id config))


(defn cfn-composite-alarm-builder>
  "The cfn-composite-alarm-builder> function updates a CfnCompositeAlarm$Builder instance using the provided configuration.
  The function takes the CfnCompositeAlarm$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionsEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:actions-enabled` |
| `actionsSuppressor` | java.lang.String | [[cdk.support/lookup-entry]] | `:actions-suppressor` |
| `actionsSuppressorExtensionPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:actions-suppressor-extension-period` |
| `actionsSuppressorWaitPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:actions-suppressor-wait-period` |
| `alarmActions` | java.util.List | [[cdk.support/lookup-entry]] | `:alarm-actions` |
| `alarmDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-description` |
| `alarmName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-name` |
| `alarmRule` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-rule` |
| `insufficientDataActions` | java.util.List | [[cdk.support/lookup-entry]] | `:insufficient-data-actions` |
| `okActions` | java.util.List | [[cdk.support/lookup-entry]] | `:ok-actions` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCompositeAlarm$Builder builder id config]
  (when-some [data (lookup-entry config id :actions-enabled)]
    (. builder actionsEnabled data))
  (when-some [data (lookup-entry config id :actions-suppressor)]
    (. builder actionsSuppressor data))
  (when-some [data (lookup-entry config id :actions-suppressor-extension-period)]
    (. builder actionsSuppressorExtensionPeriod data))
  (when-some [data (lookup-entry config id :actions-suppressor-wait-period)]
    (. builder actionsSuppressorWaitPeriod data))
  (when-some [data (lookup-entry config id :alarm-actions)]
    (. builder alarmActions data))
  (when-some [data (lookup-entry config id :alarm-description)]
    (. builder alarmDescription data))
  (when-some [data (lookup-entry config id :alarm-name)]
    (. builder alarmName data))
  (when-some [data (lookup-entry config id :alarm-rule)]
    (. builder alarmRule data))
  (when-some [data (lookup-entry config id :insufficient-data-actions)]
    (. builder insufficientDataActions data))
  (when-some [data (lookup-entry config id :ok-actions)]
    (. builder okActions data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-composite-alarm-builder
  "Creates a  `CfnCompositeAlarm$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-composite-alarm-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-composite-alarm-builder> (CfnCompositeAlarm$Builder/create scope (name id)) id config))


(defn cfn-composite-alarm-props-builder>
  "The cfn-composite-alarm-props-builder> function updates a CfnCompositeAlarmProps$Builder instance using the provided configuration.
  The function takes the CfnCompositeAlarmProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionsEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:actions-enabled` |
| `actionsSuppressor` | java.lang.String | [[cdk.support/lookup-entry]] | `:actions-suppressor` |
| `actionsSuppressorExtensionPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:actions-suppressor-extension-period` |
| `actionsSuppressorWaitPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:actions-suppressor-wait-period` |
| `alarmActions` | java.util.List | [[cdk.support/lookup-entry]] | `:alarm-actions` |
| `alarmDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-description` |
| `alarmName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-name` |
| `alarmRule` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-rule` |
| `insufficientDataActions` | java.util.List | [[cdk.support/lookup-entry]] | `:insufficient-data-actions` |
| `okActions` | java.util.List | [[cdk.support/lookup-entry]] | `:ok-actions` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCompositeAlarmProps$Builder builder id config]
  (when-some [data (lookup-entry config id :actions-enabled)]
    (. builder actionsEnabled data))
  (when-some [data (lookup-entry config id :actions-suppressor)]
    (. builder actionsSuppressor data))
  (when-some [data (lookup-entry config id :actions-suppressor-extension-period)]
    (. builder actionsSuppressorExtensionPeriod data))
  (when-some [data (lookup-entry config id :actions-suppressor-wait-period)]
    (. builder actionsSuppressorWaitPeriod data))
  (when-some [data (lookup-entry config id :alarm-actions)]
    (. builder alarmActions data))
  (when-some [data (lookup-entry config id :alarm-description)]
    (. builder alarmDescription data))
  (when-some [data (lookup-entry config id :alarm-name)]
    (. builder alarmName data))
  (when-some [data (lookup-entry config id :alarm-rule)]
    (. builder alarmRule data))
  (when-some [data (lookup-entry config id :insufficient-data-actions)]
    (. builder insufficientDataActions data))
  (when-some [data (lookup-entry config id :ok-actions)]
    (. builder okActions data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-composite-alarm-props-builder
  "Creates a  `CfnCompositeAlarmProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-composite-alarm-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-composite-alarm-props-builder> (new CfnCompositeAlarmProps$Builder) id config))


(defn cfn-dashboard-builder>
  "The cfn-dashboard-builder> function updates a CfnDashboard$Builder instance using the provided configuration.
  The function takes the CfnDashboard$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dashboardBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:dashboard-body` |
| `dashboardName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dashboard-name` |
"
  [^CfnDashboard$Builder builder id config]
  (when-some [data (lookup-entry config id :dashboard-body)]
    (. builder dashboardBody data))
  (when-some [data (lookup-entry config id :dashboard-name)]
    (. builder dashboardName data))
  (.build builder))


(defn cfn-dashboard-builder
  "Creates a  `CfnDashboard$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-dashboard-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-dashboard-builder> (CfnDashboard$Builder/create scope (name id)) id config))


(defn cfn-dashboard-props-builder>
  "The cfn-dashboard-props-builder> function updates a CfnDashboardProps$Builder instance using the provided configuration.
  The function takes the CfnDashboardProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dashboardBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:dashboard-body` |
| `dashboardName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dashboard-name` |
"
  [^CfnDashboardProps$Builder builder id config]
  (when-some [data (lookup-entry config id :dashboard-body)]
    (. builder dashboardBody data))
  (when-some [data (lookup-entry config id :dashboard-name)]
    (. builder dashboardName data))
  (.build builder))


(defn cfn-dashboard-props-builder
  "Creates a  `CfnDashboardProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-dashboard-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-dashboard-props-builder> (new CfnDashboardProps$Builder) id config))


(defn cfn-insight-rule-builder>
  "The cfn-insight-rule-builder> function updates a CfnInsightRule$Builder instance using the provided configuration.
  The function takes the CfnInsightRule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ruleBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-body` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
| `ruleState` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-state` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnInsightRule$Builder builder id config]
  (when-some [data (lookup-entry config id :rule-body)]
    (. builder ruleBody data))
  (when-some [data (lookup-entry config id :rule-name)]
    (. builder ruleName data))
  (when-some [data (lookup-entry config id :rule-state)]
    (. builder ruleState data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-insight-rule-builder
  "Creates a  `CfnInsightRule$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-insight-rule-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-insight-rule-builder> (CfnInsightRule$Builder/create scope (name id)) id config))


(defn cfn-insight-rule-props-builder>
  "The cfn-insight-rule-props-builder> function updates a CfnInsightRuleProps$Builder instance using the provided configuration.
  The function takes the CfnInsightRuleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ruleBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-body` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
| `ruleState` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-state` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnInsightRuleProps$Builder builder id config]
  (when-some [data (lookup-entry config id :rule-body)]
    (. builder ruleBody data))
  (when-some [data (lookup-entry config id :rule-name)]
    (. builder ruleName data))
  (when-some [data (lookup-entry config id :rule-state)]
    (. builder ruleState data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-insight-rule-props-builder
  "Creates a  `CfnInsightRuleProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-insight-rule-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-insight-rule-props-builder> (new CfnInsightRuleProps$Builder) id config))


(defn cfn-metric-stream-builder>
  "The cfn-metric-stream-builder> function updates a CfnMetricStream$Builder instance using the provided configuration.
  The function takes the CfnMetricStream$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludeFilters` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude-filters` |
| `firehoseArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:firehose-arn` |
| `includeFilters` | java.util.List | [[cdk.support/lookup-entry]] | `:include-filters` |
| `includeLinkedAccountsMetrics` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-linked-accounts-metrics` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `outputFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-format` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `statisticsConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:statistics-configurations` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnMetricStream$Builder builder id config]
  (when-some [data (lookup-entry config id :exclude-filters)]
    (. builder excludeFilters data))
  (when-some [data (lookup-entry config id :firehose-arn)]
    (. builder firehoseArn data))
  (when-some [data (lookup-entry config id :include-filters)]
    (. builder includeFilters data))
  (when-some [data (lookup-entry config id :include-linked-accounts-metrics)]
    (. builder includeLinkedAccountsMetrics data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :output-format)]
    (. builder outputFormat data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :statistics-configurations)]
    (. builder statisticsConfigurations data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-metric-stream-builder
  "Creates a  `CfnMetricStream$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-metric-stream-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-metric-stream-builder> (CfnMetricStream$Builder/create scope (name id)) id config))


(defn cfn-metric-stream-metric-stream-filter-property-builder>
  "The cfn-metric-stream-metric-stream-filter-property-builder> function updates a CfnMetricStream$MetricStreamFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnMetricStream$MetricStreamFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metricNames` | java.util.List | [[cdk.support/lookup-entry]] | `:metric-names` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
"
  [^CfnMetricStream$MetricStreamFilterProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :metric-names)]
    (. builder metricNames data))
  (when-some [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (.build builder))


(defn cfn-metric-stream-metric-stream-filter-property-builder
  "Creates a  `CfnMetricStream$MetricStreamFilterProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-metric-stream-metric-stream-filter-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-metric-stream-metric-stream-filter-property-builder> (new CfnMetricStream$MetricStreamFilterProperty$Builder) id config))


(defn cfn-metric-stream-metric-stream-statistics-configuration-property-builder>
  "The cfn-metric-stream-metric-stream-statistics-configuration-property-builder> function updates a CfnMetricStream$MetricStreamStatisticsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnMetricStream$MetricStreamStatisticsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalStatistics` | java.util.List | [[cdk.support/lookup-entry]] | `:additional-statistics` |
| `includeMetrics` | java.util.List | [[cdk.support/lookup-entry]] | `:include-metrics` |
"
  [^CfnMetricStream$MetricStreamStatisticsConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :additional-statistics)]
    (. builder additionalStatistics data))
  (when-some [data (lookup-entry config id :include-metrics)]
    (. builder includeMetrics data))
  (.build builder))


(defn cfn-metric-stream-metric-stream-statistics-configuration-property-builder
  "Creates a  `CfnMetricStream$MetricStreamStatisticsConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-metric-stream-metric-stream-statistics-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-metric-stream-metric-stream-statistics-configuration-property-builder> (new CfnMetricStream$MetricStreamStatisticsConfigurationProperty$Builder) id config))


(defn cfn-metric-stream-metric-stream-statistics-metric-property-builder>
  "The cfn-metric-stream-metric-stream-statistics-metric-property-builder> function updates a CfnMetricStream$MetricStreamStatisticsMetricProperty$Builder instance using the provided configuration.
  The function takes the CfnMetricStream$MetricStreamStatisticsMetricProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
"
  [^CfnMetricStream$MetricStreamStatisticsMetricProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-some [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (.build builder))


(defn cfn-metric-stream-metric-stream-statistics-metric-property-builder
  "Creates a  `CfnMetricStream$MetricStreamStatisticsMetricProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-metric-stream-metric-stream-statistics-metric-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-metric-stream-metric-stream-statistics-metric-property-builder> (new CfnMetricStream$MetricStreamStatisticsMetricProperty$Builder) id config))


(defn cfn-metric-stream-props-builder>
  "The cfn-metric-stream-props-builder> function updates a CfnMetricStreamProps$Builder instance using the provided configuration.
  The function takes the CfnMetricStreamProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludeFilters` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude-filters` |
| `firehoseArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:firehose-arn` |
| `includeFilters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-filters` |
| `includeLinkedAccountsMetrics` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-linked-accounts-metrics` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `outputFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-format` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `statisticsConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:statistics-configurations` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnMetricStreamProps$Builder builder id config]
  (when-some [data (lookup-entry config id :exclude-filters)]
    (. builder excludeFilters data))
  (when-some [data (lookup-entry config id :firehose-arn)]
    (. builder firehoseArn data))
  (when-some [data (lookup-entry config id :include-filters)]
    (. builder includeFilters data))
  (when-some [data (lookup-entry config id :include-linked-accounts-metrics)]
    (. builder includeLinkedAccountsMetrics data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :output-format)]
    (. builder outputFormat data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :statistics-configurations)]
    (. builder statisticsConfigurations data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-metric-stream-props-builder
  "Creates a  `CfnMetricStreamProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-metric-stream-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-metric-stream-props-builder> (new CfnMetricStreamProps$Builder) id config))


(defn common-metric-options-builder>
  "The common-metric-options-builder> function updates a CommonMetricOptions$Builder instance using the provided configuration.
  The function takes the CommonMetricOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `color` | java.lang.String | [[cdk.support/lookup-entry]] | `:color` |
| `dimensionsMap` | java.util.Map | [[cdk.support/lookup-entry]] | `:dimensions-map` |
| `label` | java.lang.String | [[cdk.support/lookup-entry]] | `:label` |
| `period` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:period` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `statistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:statistic` |
| `unit` | software.amazon.awscdk.services.cloudwatch.Unit | [[cdk.api.services.cloudwatch/unit]] | `:unit` |
"
  [^CommonMetricOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :account)]
    (. builder account data))
  (when-some [data (lookup-entry config id :color)]
    (. builder color data))
  (when-some [data (lookup-entry config id :dimensions-map)]
    (. builder dimensionsMap data))
  (when-some [data (lookup-entry config id :label)]
    (. builder label data))
  (when-some [data (lookup-entry config id :period)]
    (. builder period data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :statistic)]
    (. builder statistic data))
  (when-some [data (unit config id :unit)]
    (. builder unit data))
  (.build builder))


(defn common-metric-options-builder
  "Creates a  `CommonMetricOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[common-metric-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (common-metric-options-builder> (new CommonMetricOptions$Builder) id config))


(defn composite-alarm-builder>
  "The composite-alarm-builder> function updates a CompositeAlarm$Builder instance using the provided configuration.
  The function takes the CompositeAlarm$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:actions-enabled` |
| `actionsSuppressor` | software.amazon.awscdk.services.cloudwatch.IAlarm | [[cdk.support/lookup-entry]] | `:actions-suppressor` |
| `actionsSuppressorExtensionPeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:actions-suppressor-extension-period` |
| `actionsSuppressorWaitPeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:actions-suppressor-wait-period` |
| `alarmDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-description` |
| `alarmRule` | software.amazon.awscdk.services.cloudwatch.IAlarmRule | [[cdk.support/lookup-entry]] | `:alarm-rule` |
| `compositeAlarmName` | java.lang.String | [[cdk.support/lookup-entry]] | `:composite-alarm-name` |
"
  [^CompositeAlarm$Builder builder id config]
  (when-some [data (lookup-entry config id :actions-enabled)]
    (. builder actionsEnabled data))
  (when-some [data (lookup-entry config id :actions-suppressor)]
    (. builder actionsSuppressor data))
  (when-some [data (lookup-entry config id :actions-suppressor-extension-period)]
    (. builder actionsSuppressorExtensionPeriod data))
  (when-some [data (lookup-entry config id :actions-suppressor-wait-period)]
    (. builder actionsSuppressorWaitPeriod data))
  (when-some [data (lookup-entry config id :alarm-description)]
    (. builder alarmDescription data))
  (when-some [data (lookup-entry config id :alarm-rule)]
    (. builder alarmRule data))
  (when-some [data (lookup-entry config id :composite-alarm-name)]
    (. builder compositeAlarmName data))
  (.build builder))


(defn composite-alarm-builder
  "Creates a  `CompositeAlarm$Builder` instance using a scope and ID, applies the data configuration using the [[composite-alarm-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (composite-alarm-builder> (CompositeAlarm$Builder/create scope (name id)) id config))


(defn composite-alarm-props-builder>
  "The composite-alarm-props-builder> function updates a CompositeAlarmProps$Builder instance using the provided configuration.
  The function takes the CompositeAlarmProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:actions-enabled` |
| `actionsSuppressor` | software.amazon.awscdk.services.cloudwatch.IAlarm | [[cdk.support/lookup-entry]] | `:actions-suppressor` |
| `actionsSuppressorExtensionPeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:actions-suppressor-extension-period` |
| `actionsSuppressorWaitPeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:actions-suppressor-wait-period` |
| `alarmDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-description` |
| `alarmRule` | software.amazon.awscdk.services.cloudwatch.IAlarmRule | [[cdk.support/lookup-entry]] | `:alarm-rule` |
| `compositeAlarmName` | java.lang.String | [[cdk.support/lookup-entry]] | `:composite-alarm-name` |
"
  [^CompositeAlarmProps$Builder builder id config]
  (when-some [data (lookup-entry config id :actions-enabled)]
    (. builder actionsEnabled data))
  (when-some [data (lookup-entry config id :actions-suppressor)]
    (. builder actionsSuppressor data))
  (when-some [data (lookup-entry config id :actions-suppressor-extension-period)]
    (. builder actionsSuppressorExtensionPeriod data))
  (when-some [data (lookup-entry config id :actions-suppressor-wait-period)]
    (. builder actionsSuppressorWaitPeriod data))
  (when-some [data (lookup-entry config id :alarm-description)]
    (. builder alarmDescription data))
  (when-some [data (lookup-entry config id :alarm-rule)]
    (. builder alarmRule data))
  (when-some [data (lookup-entry config id :composite-alarm-name)]
    (. builder compositeAlarmName data))
  (.build builder))


(defn composite-alarm-props-builder
  "Creates a  `CompositeAlarmProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[composite-alarm-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (composite-alarm-props-builder> (new CompositeAlarmProps$Builder) id config))


(defn create-alarm-options-builder>
  "The create-alarm-options-builder> function updates a CreateAlarmOptions$Builder instance using the provided configuration.
  The function takes the CreateAlarmOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:actions-enabled` |
| `alarmDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-description` |
| `alarmName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-name` |
| `comparisonOperator` | software.amazon.awscdk.services.cloudwatch.ComparisonOperator | [[cdk.api.services.cloudwatch/comparison-operator]] | `:comparison-operator` |
| `datapointsToAlarm` | java.lang.Number | [[cdk.support/lookup-entry]] | `:datapoints-to-alarm` |
| `evaluateLowSampleCountPercentile` | java.lang.String | [[cdk.support/lookup-entry]] | `:evaluate-low-sample-count-percentile` |
| `evaluationPeriods` | java.lang.Number | [[cdk.support/lookup-entry]] | `:evaluation-periods` |
| `threshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:threshold` |
| `treatMissingData` | software.amazon.awscdk.services.cloudwatch.TreatMissingData | [[cdk.api.services.cloudwatch/treat-missing-data]] | `:treat-missing-data` |
"
  [^CreateAlarmOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :actions-enabled)]
    (. builder actionsEnabled data))
  (when-some [data (lookup-entry config id :alarm-description)]
    (. builder alarmDescription data))
  (when-some [data (lookup-entry config id :alarm-name)]
    (. builder alarmName data))
  (when-some [data (comparison-operator config id :comparison-operator)]
    (. builder comparisonOperator data))
  (when-some [data (lookup-entry config id :datapoints-to-alarm)]
    (. builder datapointsToAlarm data))
  (when-some [data (lookup-entry config id :evaluate-low-sample-count-percentile)]
    (. builder evaluateLowSampleCountPercentile data))
  (when-some [data (lookup-entry config id :evaluation-periods)]
    (. builder evaluationPeriods data))
  (when-some [data (lookup-entry config id :threshold)]
    (. builder threshold data))
  (when-some [data (treat-missing-data config id :treat-missing-data)]
    (. builder treatMissingData data))
  (.build builder))


(defn create-alarm-options-builder
  "Creates a  `CreateAlarmOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[create-alarm-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (create-alarm-options-builder> (new CreateAlarmOptions$Builder) id config))


(defn custom-widget-builder>
  "The custom-widget-builder> function updates a CustomWidget$Builder instance using the provided configuration.
  The function takes the CustomWidget$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-arn` |
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `params` | java.lang.Object | [[cdk.support/lookup-entry]] | `:params` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `updateOnRefresh` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:update-on-refresh` |
| `updateOnResize` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:update-on-resize` |
| `updateOnTimeRangeChange` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:update-on-time-range-change` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |
"
  [^CustomWidget$Builder builder id config]
  (when-some [data (lookup-entry config id :function-arn)]
    (. builder functionArn data))
  (when-some [data (lookup-entry config id :height)]
    (. builder height data))
  (when-some [data (lookup-entry config id :params)]
    (. builder params data))
  (when-some [data (lookup-entry config id :title)]
    (. builder title data))
  (when-some [data (lookup-entry config id :update-on-refresh)]
    (. builder updateOnRefresh data))
  (when-some [data (lookup-entry config id :update-on-resize)]
    (. builder updateOnResize data))
  (when-some [data (lookup-entry config id :update-on-time-range-change)]
    (. builder updateOnTimeRangeChange data))
  (when-some [data (lookup-entry config id :width)]
    (. builder width data))
  (.build builder))


(defn custom-widget-builder
  "Creates a  `CustomWidget$Builder` instance using a no-argument create, applies the data configuration using the [[custom-widget-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (custom-widget-builder> (CustomWidget$Builder/create) id config))


(defn custom-widget-props-builder>
  "The custom-widget-props-builder> function updates a CustomWidgetProps$Builder instance using the provided configuration.
  The function takes the CustomWidgetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-arn` |
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `params` | java.lang.Object | [[cdk.support/lookup-entry]] | `:params` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `updateOnRefresh` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:update-on-refresh` |
| `updateOnResize` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:update-on-resize` |
| `updateOnTimeRangeChange` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:update-on-time-range-change` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |
"
  [^CustomWidgetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :function-arn)]
    (. builder functionArn data))
  (when-some [data (lookup-entry config id :height)]
    (. builder height data))
  (when-some [data (lookup-entry config id :params)]
    (. builder params data))
  (when-some [data (lookup-entry config id :title)]
    (. builder title data))
  (when-some [data (lookup-entry config id :update-on-refresh)]
    (. builder updateOnRefresh data))
  (when-some [data (lookup-entry config id :update-on-resize)]
    (. builder updateOnResize data))
  (when-some [data (lookup-entry config id :update-on-time-range-change)]
    (. builder updateOnTimeRangeChange data))
  (when-some [data (lookup-entry config id :width)]
    (. builder width data))
  (.build builder))


(defn custom-widget-props-builder
  "Creates a  `CustomWidgetProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[custom-widget-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (custom-widget-props-builder> (new CustomWidgetProps$Builder) id config))


(defn dashboard-builder>
  "The dashboard-builder> function updates a Dashboard$Builder instance using the provided configuration.
  The function takes the Dashboard$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dashboardName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dashboard-name` |
| `defaultInterval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:default-interval` |
| `end` | java.lang.String | [[cdk.support/lookup-entry]] | `:end` |
| `periodOverride` | software.amazon.awscdk.services.cloudwatch.PeriodOverride | [[cdk.api.services.cloudwatch/period-override]] | `:period-override` |
| `start` | java.lang.String | [[cdk.support/lookup-entry]] | `:start` |
| `variables` | java.util.List | [[cdk.support/lookup-entry]] | `:variables` |
| `widgets` | java.util.List | [[cdk.support/lookup-entry]] | `:widgets` |
"
  [^Dashboard$Builder builder id config]
  (when-some [data (lookup-entry config id :dashboard-name)]
    (. builder dashboardName data))
  (when-some [data (lookup-entry config id :default-interval)]
    (. builder defaultInterval data))
  (when-some [data (lookup-entry config id :end)]
    (. builder end data))
  (when-some [data (period-override config id :period-override)]
    (. builder periodOverride data))
  (when-some [data (lookup-entry config id :start)]
    (. builder start data))
  (when-some [data (lookup-entry config id :variables)]
    (. builder variables data))
  (when-some [data (lookup-entry config id :widgets)]
    (. builder widgets data))
  (.build builder))


(defn dashboard-builder
  "Creates a  `Dashboard$Builder` instance using a scope and ID, applies the data configuration using the [[dashboard-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (dashboard-builder> (Dashboard$Builder/create scope (name id)) id config))


(defn dashboard-props-builder>
  "The dashboard-props-builder> function updates a DashboardProps$Builder instance using the provided configuration.
  The function takes the DashboardProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dashboardName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dashboard-name` |
| `defaultInterval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:default-interval` |
| `end` | java.lang.String | [[cdk.support/lookup-entry]] | `:end` |
| `periodOverride` | software.amazon.awscdk.services.cloudwatch.PeriodOverride | [[cdk.api.services.cloudwatch/period-override]] | `:period-override` |
| `start` | java.lang.String | [[cdk.support/lookup-entry]] | `:start` |
| `variables` | java.util.List | [[cdk.support/lookup-entry]] | `:variables` |
| `widgets` | java.util.List | [[cdk.support/lookup-entry]] | `:widgets` |
"
  [^DashboardProps$Builder builder id config]
  (when-some [data (lookup-entry config id :dashboard-name)]
    (. builder dashboardName data))
  (when-some [data (lookup-entry config id :default-interval)]
    (. builder defaultInterval data))
  (when-some [data (lookup-entry config id :end)]
    (. builder end data))
  (when-some [data (period-override config id :period-override)]
    (. builder periodOverride data))
  (when-some [data (lookup-entry config id :start)]
    (. builder start data))
  (when-some [data (lookup-entry config id :variables)]
    (. builder variables data))
  (when-some [data (lookup-entry config id :widgets)]
    (. builder widgets data))
  (.build builder))


(defn dashboard-props-builder
  "Creates a  `DashboardProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[dashboard-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (dashboard-props-builder> (new DashboardProps$Builder) id config))


(defn dashboard-variable-builder>
  "The dashboard-variable-builder> function updates a DashboardVariable$Builder instance using the provided configuration.
  The function takes the DashboardVariable$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultValue` | software.amazon.awscdk.services.cloudwatch.DefaultValue | [[cdk.support/lookup-entry]] | `:default-value` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `inputType` | software.amazon.awscdk.services.cloudwatch.VariableInputType | [[cdk.api.services.cloudwatch/variable-input-type]] | `:input-type` |
| `label` | java.lang.String | [[cdk.support/lookup-entry]] | `:label` |
| `type` | software.amazon.awscdk.services.cloudwatch.VariableType | [[cdk.api.services.cloudwatch/variable-type]] | `:type` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
| `values` | software.amazon.awscdk.services.cloudwatch.Values | [[cdk.support/lookup-entry]] | `:values` |
| `visible` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:visible` |
"
  [^DashboardVariable$Builder builder id config]
  (when-some [data (lookup-entry config id :default-value)]
    (. builder defaultValue data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (variable-input-type config id :input-type)]
    (. builder inputType data))
  (when-some [data (lookup-entry config id :label)]
    (. builder label data))
  (when-some [data (variable-type config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (when-some [data (lookup-entry config id :values)]
    (. builder values data))
  (when-some [data (lookup-entry config id :visible)]
    (. builder visible data))
  (.build builder))


(defn dashboard-variable-builder
  "Creates a  `DashboardVariable$Builder` instance using a no-argument create, applies the data configuration using the [[dashboard-variable-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (dashboard-variable-builder> (DashboardVariable$Builder/create) id config))


(defn dashboard-variable-options-builder>
  "The dashboard-variable-options-builder> function updates a DashboardVariableOptions$Builder instance using the provided configuration.
  The function takes the DashboardVariableOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultValue` | software.amazon.awscdk.services.cloudwatch.DefaultValue | [[cdk.support/lookup-entry]] | `:default-value` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `inputType` | software.amazon.awscdk.services.cloudwatch.VariableInputType | [[cdk.api.services.cloudwatch/variable-input-type]] | `:input-type` |
| `label` | java.lang.String | [[cdk.support/lookup-entry]] | `:label` |
| `type` | software.amazon.awscdk.services.cloudwatch.VariableType | [[cdk.api.services.cloudwatch/variable-type]] | `:type` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
| `values` | software.amazon.awscdk.services.cloudwatch.Values | [[cdk.support/lookup-entry]] | `:values` |
| `visible` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:visible` |
"
  [^DashboardVariableOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :default-value)]
    (. builder defaultValue data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (variable-input-type config id :input-type)]
    (. builder inputType data))
  (when-some [data (lookup-entry config id :label)]
    (. builder label data))
  (when-some [data (variable-type config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (when-some [data (lookup-entry config id :values)]
    (. builder values data))
  (when-some [data (lookup-entry config id :visible)]
    (. builder visible data))
  (.build builder))


(defn dashboard-variable-options-builder
  "Creates a  `DashboardVariableOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[dashboard-variable-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (dashboard-variable-options-builder> (new DashboardVariableOptions$Builder) id config))


(defn dimension-builder>
  "The dimension-builder> function updates a Dimension$Builder instance using the provided configuration.
  The function takes the Dimension$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.Object | [[cdk.support/lookup-entry]] | `:value` |
"
  [^Dimension$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn dimension-builder
  "Creates a  `Dimension$Builder` instance using a no-argument constructor, applies the data configuration using the [[dimension-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (dimension-builder> (new Dimension$Builder) id config))


(defn gauge-widget-builder>
  "The gauge-widget-builder> function updates a GaugeWidget$Builder instance using the provided configuration.
  The function takes the GaugeWidget$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `annotations` | java.util.List | [[cdk.support/lookup-entry]] | `:annotations` |
| `end` | java.lang.String | [[cdk.support/lookup-entry]] | `:end` |
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `leftYAxis` | software.amazon.awscdk.services.cloudwatch.YAxisProps | [[cdk.support/lookup-entry]] | `:left-y-axis` |
| `legendPosition` | software.amazon.awscdk.services.cloudwatch.LegendPosition | [[cdk.api.services.cloudwatch/legend-position]] | `:legend-position` |
| `liveData` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:live-data` |
| `metrics` | java.util.List | [[cdk.support/lookup-entry]] | `:metrics` |
| `period` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:period` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `setPeriodToTimeRange` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:set-period-to-time-range` |
| `start` | java.lang.String | [[cdk.support/lookup-entry]] | `:start` |
| `statistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:statistic` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |
"
  [^GaugeWidget$Builder builder id config]
  (when-some [data (lookup-entry config id :annotations)]
    (. builder annotations data))
  (when-some [data (lookup-entry config id :end)]
    (. builder end data))
  (when-some [data (lookup-entry config id :height)]
    (. builder height data))
  (when-some [data (lookup-entry config id :left-y-axis)]
    (. builder leftYAxis data))
  (when-some [data (legend-position config id :legend-position)]
    (. builder legendPosition data))
  (when-some [data (lookup-entry config id :live-data)]
    (. builder liveData data))
  (when-some [data (lookup-entry config id :metrics)]
    (. builder metrics data))
  (when-some [data (lookup-entry config id :period)]
    (. builder period data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :set-period-to-time-range)]
    (. builder setPeriodToTimeRange data))
  (when-some [data (lookup-entry config id :start)]
    (. builder start data))
  (when-some [data (lookup-entry config id :statistic)]
    (. builder statistic data))
  (when-some [data (lookup-entry config id :title)]
    (. builder title data))
  (when-some [data (lookup-entry config id :width)]
    (. builder width data))
  (.build builder))


(defn gauge-widget-builder
  "Creates a  `GaugeWidget$Builder` instance using a no-argument create, applies the data configuration using the [[gauge-widget-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (gauge-widget-builder> (GaugeWidget$Builder/create) id config))


(defn gauge-widget-props-builder>
  "The gauge-widget-props-builder> function updates a GaugeWidgetProps$Builder instance using the provided configuration.
  The function takes the GaugeWidgetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `annotations` | java.util.List | [[cdk.support/lookup-entry]] | `:annotations` |
| `end` | java.lang.String | [[cdk.support/lookup-entry]] | `:end` |
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `leftYAxis` | software.amazon.awscdk.services.cloudwatch.YAxisProps | [[cdk.support/lookup-entry]] | `:left-y-axis` |
| `legendPosition` | software.amazon.awscdk.services.cloudwatch.LegendPosition | [[cdk.api.services.cloudwatch/legend-position]] | `:legend-position` |
| `liveData` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:live-data` |
| `metrics` | java.util.List | [[cdk.support/lookup-entry]] | `:metrics` |
| `period` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:period` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `setPeriodToTimeRange` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:set-period-to-time-range` |
| `start` | java.lang.String | [[cdk.support/lookup-entry]] | `:start` |
| `statistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:statistic` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |
"
  [^GaugeWidgetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :annotations)]
    (. builder annotations data))
  (when-some [data (lookup-entry config id :end)]
    (. builder end data))
  (when-some [data (lookup-entry config id :height)]
    (. builder height data))
  (when-some [data (lookup-entry config id :left-y-axis)]
    (. builder leftYAxis data))
  (when-some [data (legend-position config id :legend-position)]
    (. builder legendPosition data))
  (when-some [data (lookup-entry config id :live-data)]
    (. builder liveData data))
  (when-some [data (lookup-entry config id :metrics)]
    (. builder metrics data))
  (when-some [data (lookup-entry config id :period)]
    (. builder period data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :set-period-to-time-range)]
    (. builder setPeriodToTimeRange data))
  (when-some [data (lookup-entry config id :start)]
    (. builder start data))
  (when-some [data (lookup-entry config id :statistic)]
    (. builder statistic data))
  (when-some [data (lookup-entry config id :title)]
    (. builder title data))
  (when-some [data (lookup-entry config id :width)]
    (. builder width data))
  (.build builder))


(defn gauge-widget-props-builder
  "Creates a  `GaugeWidgetProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[gauge-widget-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (gauge-widget-props-builder> (new GaugeWidgetProps$Builder) id config))


(defn graph-widget-builder>
  "The graph-widget-builder> function updates a GraphWidget$Builder instance using the provided configuration.
  The function takes the GraphWidget$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `end` | java.lang.String | [[cdk.support/lookup-entry]] | `:end` |
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `left` | java.util.List | [[cdk.support/lookup-entry]] | `:left` |
| `leftAnnotations` | java.util.List | [[cdk.support/lookup-entry]] | `:left-annotations` |
| `leftYAxis` | software.amazon.awscdk.services.cloudwatch.YAxisProps | [[cdk.support/lookup-entry]] | `:left-y-axis` |
| `legendPosition` | software.amazon.awscdk.services.cloudwatch.LegendPosition | [[cdk.api.services.cloudwatch/legend-position]] | `:legend-position` |
| `liveData` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:live-data` |
| `period` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:period` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `right` | java.util.List | [[cdk.support/lookup-entry]] | `:right` |
| `rightAnnotations` | java.util.List | [[cdk.support/lookup-entry]] | `:right-annotations` |
| `rightYAxis` | software.amazon.awscdk.services.cloudwatch.YAxisProps | [[cdk.support/lookup-entry]] | `:right-y-axis` |
| `setPeriodToTimeRange` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:set-period-to-time-range` |
| `stacked` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:stacked` |
| `start` | java.lang.String | [[cdk.support/lookup-entry]] | `:start` |
| `statistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:statistic` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `verticalAnnotations` | java.util.List | [[cdk.support/lookup-entry]] | `:vertical-annotations` |
| `view` | software.amazon.awscdk.services.cloudwatch.GraphWidgetView | [[cdk.api.services.cloudwatch/graph-widget-view]] | `:view` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |
"
  [^GraphWidget$Builder builder id config]
  (when-some [data (lookup-entry config id :end)]
    (. builder end data))
  (when-some [data (lookup-entry config id :height)]
    (. builder height data))
  (when-some [data (lookup-entry config id :left)]
    (. builder left data))
  (when-some [data (lookup-entry config id :left-annotations)]
    (. builder leftAnnotations data))
  (when-some [data (lookup-entry config id :left-y-axis)]
    (. builder leftYAxis data))
  (when-some [data (legend-position config id :legend-position)]
    (. builder legendPosition data))
  (when-some [data (lookup-entry config id :live-data)]
    (. builder liveData data))
  (when-some [data (lookup-entry config id :period)]
    (. builder period data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :right)]
    (. builder right data))
  (when-some [data (lookup-entry config id :right-annotations)]
    (. builder rightAnnotations data))
  (when-some [data (lookup-entry config id :right-y-axis)]
    (. builder rightYAxis data))
  (when-some [data (lookup-entry config id :set-period-to-time-range)]
    (. builder setPeriodToTimeRange data))
  (when-some [data (lookup-entry config id :stacked)]
    (. builder stacked data))
  (when-some [data (lookup-entry config id :start)]
    (. builder start data))
  (when-some [data (lookup-entry config id :statistic)]
    (. builder statistic data))
  (when-some [data (lookup-entry config id :title)]
    (. builder title data))
  (when-some [data (lookup-entry config id :vertical-annotations)]
    (. builder verticalAnnotations data))
  (when-some [data (graph-widget-view config id :view)]
    (. builder view data))
  (when-some [data (lookup-entry config id :width)]
    (. builder width data))
  (.build builder))


(defn graph-widget-builder
  "Creates a  `GraphWidget$Builder` instance using a no-argument create, applies the data configuration using the [[graph-widget-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (graph-widget-builder> (GraphWidget$Builder/create) id config))


(defn graph-widget-props-builder>
  "The graph-widget-props-builder> function updates a GraphWidgetProps$Builder instance using the provided configuration.
  The function takes the GraphWidgetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `end` | java.lang.String | [[cdk.support/lookup-entry]] | `:end` |
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `left` | java.util.List | [[cdk.support/lookup-entry]] | `:left` |
| `leftAnnotations` | java.util.List | [[cdk.support/lookup-entry]] | `:left-annotations` |
| `leftYAxis` | software.amazon.awscdk.services.cloudwatch.YAxisProps | [[cdk.support/lookup-entry]] | `:left-y-axis` |
| `legendPosition` | software.amazon.awscdk.services.cloudwatch.LegendPosition | [[cdk.api.services.cloudwatch/legend-position]] | `:legend-position` |
| `liveData` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:live-data` |
| `period` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:period` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `right` | java.util.List | [[cdk.support/lookup-entry]] | `:right` |
| `rightAnnotations` | java.util.List | [[cdk.support/lookup-entry]] | `:right-annotations` |
| `rightYAxis` | software.amazon.awscdk.services.cloudwatch.YAxisProps | [[cdk.support/lookup-entry]] | `:right-y-axis` |
| `setPeriodToTimeRange` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:set-period-to-time-range` |
| `stacked` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:stacked` |
| `start` | java.lang.String | [[cdk.support/lookup-entry]] | `:start` |
| `statistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:statistic` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `verticalAnnotations` | java.util.List | [[cdk.support/lookup-entry]] | `:vertical-annotations` |
| `view` | software.amazon.awscdk.services.cloudwatch.GraphWidgetView | [[cdk.api.services.cloudwatch/graph-widget-view]] | `:view` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |
"
  [^GraphWidgetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :end)]
    (. builder end data))
  (when-some [data (lookup-entry config id :height)]
    (. builder height data))
  (when-some [data (lookup-entry config id :left)]
    (. builder left data))
  (when-some [data (lookup-entry config id :left-annotations)]
    (. builder leftAnnotations data))
  (when-some [data (lookup-entry config id :left-y-axis)]
    (. builder leftYAxis data))
  (when-some [data (legend-position config id :legend-position)]
    (. builder legendPosition data))
  (when-some [data (lookup-entry config id :live-data)]
    (. builder liveData data))
  (when-some [data (lookup-entry config id :period)]
    (. builder period data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :right)]
    (. builder right data))
  (when-some [data (lookup-entry config id :right-annotations)]
    (. builder rightAnnotations data))
  (when-some [data (lookup-entry config id :right-y-axis)]
    (. builder rightYAxis data))
  (when-some [data (lookup-entry config id :set-period-to-time-range)]
    (. builder setPeriodToTimeRange data))
  (when-some [data (lookup-entry config id :stacked)]
    (. builder stacked data))
  (when-some [data (lookup-entry config id :start)]
    (. builder start data))
  (when-some [data (lookup-entry config id :statistic)]
    (. builder statistic data))
  (when-some [data (lookup-entry config id :title)]
    (. builder title data))
  (when-some [data (lookup-entry config id :vertical-annotations)]
    (. builder verticalAnnotations data))
  (when-some [data (graph-widget-view config id :view)]
    (. builder view data))
  (when-some [data (lookup-entry config id :width)]
    (. builder width data))
  (.build builder))


(defn graph-widget-props-builder
  "Creates a  `GraphWidgetProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[graph-widget-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (graph-widget-props-builder> (new GraphWidgetProps$Builder) id config))


(defn horizontal-annotation-builder>
  "The horizontal-annotation-builder> function updates a HorizontalAnnotation$Builder instance using the provided configuration.
  The function takes the HorizontalAnnotation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `color` | java.lang.String | [[cdk.support/lookup-entry]] | `:color` |
| `fill` | software.amazon.awscdk.services.cloudwatch.Shading | [[cdk.api.services.cloudwatch/shading]] | `:fill` |
| `label` | java.lang.String | [[cdk.support/lookup-entry]] | `:label` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |
| `visible` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:visible` |
"
  [^HorizontalAnnotation$Builder builder id config]
  (when-some [data (lookup-entry config id :color)]
    (. builder color data))
  (when-some [data (shading config id :fill)]
    (. builder fill data))
  (when-some [data (lookup-entry config id :label)]
    (. builder label data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (when-some [data (lookup-entry config id :visible)]
    (. builder visible data))
  (.build builder))


(defn horizontal-annotation-builder
  "Creates a  `HorizontalAnnotation$Builder` instance using a no-argument constructor, applies the data configuration using the [[horizontal-annotation-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (horizontal-annotation-builder> (new HorizontalAnnotation$Builder) id config))


(defn log-query-widget-builder>
  "The log-query-widget-builder> function updates a LogQueryWidget$Builder instance using the provided configuration.
  The function takes the LogQueryWidget$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `logGroupNames` | java.util.List | [[cdk.support/lookup-entry]] | `:log-group-names` |
| `queryLines` | java.util.List | [[cdk.support/lookup-entry]] | `:query-lines` |
| `queryString` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-string` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `view` | software.amazon.awscdk.services.cloudwatch.LogQueryVisualizationType | [[cdk.api.services.cloudwatch/log-query-visualization-type]] | `:view` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |
"
  [^LogQueryWidget$Builder builder id config]
  (when-some [data (lookup-entry config id :height)]
    (. builder height data))
  (when-some [data (lookup-entry config id :log-group-names)]
    (. builder logGroupNames data))
  (when-some [data (lookup-entry config id :query-lines)]
    (. builder queryLines data))
  (when-some [data (lookup-entry config id :query-string)]
    (. builder queryString data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :title)]
    (. builder title data))
  (when-some [data (log-query-visualization-type config id :view)]
    (. builder view data))
  (when-some [data (lookup-entry config id :width)]
    (. builder width data))
  (.build builder))


(defn log-query-widget-builder
  "Creates a  `LogQueryWidget$Builder` instance using a no-argument create, applies the data configuration using the [[log-query-widget-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (log-query-widget-builder> (LogQueryWidget$Builder/create) id config))


(defn log-query-widget-props-builder>
  "The log-query-widget-props-builder> function updates a LogQueryWidgetProps$Builder instance using the provided configuration.
  The function takes the LogQueryWidgetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `logGroupNames` | java.util.List | [[cdk.support/lookup-entry]] | `:log-group-names` |
| `queryLines` | java.util.List | [[cdk.support/lookup-entry]] | `:query-lines` |
| `queryString` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-string` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `view` | software.amazon.awscdk.services.cloudwatch.LogQueryVisualizationType | [[cdk.api.services.cloudwatch/log-query-visualization-type]] | `:view` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |
"
  [^LogQueryWidgetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :height)]
    (. builder height data))
  (when-some [data (lookup-entry config id :log-group-names)]
    (. builder logGroupNames data))
  (when-some [data (lookup-entry config id :query-lines)]
    (. builder queryLines data))
  (when-some [data (lookup-entry config id :query-string)]
    (. builder queryString data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :title)]
    (. builder title data))
  (when-some [data (log-query-visualization-type config id :view)]
    (. builder view data))
  (when-some [data (lookup-entry config id :width)]
    (. builder width data))
  (.build builder))


(defn log-query-widget-props-builder
  "Creates a  `LogQueryWidgetProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[log-query-widget-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (log-query-widget-props-builder> (new LogQueryWidgetProps$Builder) id config))


(defn math-expression-builder>
  "The math-expression-builder> function updates a MathExpression$Builder instance using the provided configuration.
  The function takes the MathExpression$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `color` | java.lang.String | [[cdk.support/lookup-entry]] | `:color` |
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `label` | java.lang.String | [[cdk.support/lookup-entry]] | `:label` |
| `period` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:period` |
| `searchAccount` | java.lang.String | [[cdk.support/lookup-entry]] | `:search-account` |
| `searchRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:search-region` |
| `usingMetrics` | java.util.Map | [[cdk.support/lookup-entry]] | `:using-metrics` |
"
  [^MathExpression$Builder builder id config]
  (when-some [data (lookup-entry config id :color)]
    (. builder color data))
  (when-some [data (lookup-entry config id :expression)]
    (. builder expression data))
  (when-some [data (lookup-entry config id :label)]
    (. builder label data))
  (when-some [data (lookup-entry config id :period)]
    (. builder period data))
  (when-some [data (lookup-entry config id :search-account)]
    (. builder searchAccount data))
  (when-some [data (lookup-entry config id :search-region)]
    (. builder searchRegion data))
  (when-some [data (lookup-entry config id :using-metrics)]
    (. builder usingMetrics data))
  (.build builder))


(defn math-expression-builder
  "Creates a  `MathExpression$Builder` instance using a no-argument create, applies the data configuration using the [[math-expression-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (math-expression-builder> (MathExpression$Builder/create) id config))


(defn math-expression-options-builder>
  "The math-expression-options-builder> function updates a MathExpressionOptions$Builder instance using the provided configuration.
  The function takes the MathExpressionOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `color` | java.lang.String | [[cdk.support/lookup-entry]] | `:color` |
| `label` | java.lang.String | [[cdk.support/lookup-entry]] | `:label` |
| `period` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:period` |
| `searchAccount` | java.lang.String | [[cdk.support/lookup-entry]] | `:search-account` |
| `searchRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:search-region` |
"
  [^MathExpressionOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :color)]
    (. builder color data))
  (when-some [data (lookup-entry config id :label)]
    (. builder label data))
  (when-some [data (lookup-entry config id :period)]
    (. builder period data))
  (when-some [data (lookup-entry config id :search-account)]
    (. builder searchAccount data))
  (when-some [data (lookup-entry config id :search-region)]
    (. builder searchRegion data))
  (.build builder))


(defn math-expression-options-builder
  "Creates a  `MathExpressionOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[math-expression-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (math-expression-options-builder> (new MathExpressionOptions$Builder) id config))


(defn math-expression-props-builder>
  "The math-expression-props-builder> function updates a MathExpressionProps$Builder instance using the provided configuration.
  The function takes the MathExpressionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `color` | java.lang.String | [[cdk.support/lookup-entry]] | `:color` |
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `label` | java.lang.String | [[cdk.support/lookup-entry]] | `:label` |
| `period` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:period` |
| `searchAccount` | java.lang.String | [[cdk.support/lookup-entry]] | `:search-account` |
| `searchRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:search-region` |
| `usingMetrics` | java.util.Map | [[cdk.support/lookup-entry]] | `:using-metrics` |
"
  [^MathExpressionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :color)]
    (. builder color data))
  (when-some [data (lookup-entry config id :expression)]
    (. builder expression data))
  (when-some [data (lookup-entry config id :label)]
    (. builder label data))
  (when-some [data (lookup-entry config id :period)]
    (. builder period data))
  (when-some [data (lookup-entry config id :search-account)]
    (. builder searchAccount data))
  (when-some [data (lookup-entry config id :search-region)]
    (. builder searchRegion data))
  (when-some [data (lookup-entry config id :using-metrics)]
    (. builder usingMetrics data))
  (.build builder))


(defn math-expression-props-builder
  "Creates a  `MathExpressionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[math-expression-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (math-expression-props-builder> (new MathExpressionProps$Builder) id config))


(defn metric-builder>
  "The metric-builder> function updates a Metric$Builder instance using the provided configuration.
  The function takes the Metric$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `color` | java.lang.String | [[cdk.support/lookup-entry]] | `:color` |
| `dimensionsMap` | java.util.Map | [[cdk.support/lookup-entry]] | `:dimensions-map` |
| `label` | java.lang.String | [[cdk.support/lookup-entry]] | `:label` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `period` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:period` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `statistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:statistic` |
| `unit` | software.amazon.awscdk.services.cloudwatch.Unit | [[cdk.api.services.cloudwatch/unit]] | `:unit` |
"
  [^Metric$Builder builder id config]
  (when-some [data (lookup-entry config id :account)]
    (. builder account data))
  (when-some [data (lookup-entry config id :color)]
    (. builder color data))
  (when-some [data (lookup-entry config id :dimensions-map)]
    (. builder dimensionsMap data))
  (when-some [data (lookup-entry config id :label)]
    (. builder label data))
  (when-some [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-some [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (when-some [data (lookup-entry config id :period)]
    (. builder period data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :statistic)]
    (. builder statistic data))
  (when-some [data (unit config id :unit)]
    (. builder unit data))
  (.build builder))


(defn metric-builder
  "Creates a  `Metric$Builder` instance using a no-argument create, applies the data configuration using the [[metric-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (metric-builder> (Metric$Builder/create) id config))


(defn metric-config-builder>
  "The metric-config-builder> function updates a MetricConfig$Builder instance using the provided configuration.
  The function takes the MetricConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mathExpression` | software.amazon.awscdk.services.cloudwatch.MetricExpressionConfig | [[cdk.support/lookup-entry]] | `:math-expression` |
| `metricStat` | software.amazon.awscdk.services.cloudwatch.MetricStatConfig | [[cdk.support/lookup-entry]] | `:metric-stat` |
| `renderingProperties` | java.util.Map | [[cdk.support/lookup-entry]] | `:rendering-properties` |
"
  [^MetricConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :math-expression)]
    (. builder mathExpression data))
  (when-some [data (lookup-entry config id :metric-stat)]
    (. builder metricStat data))
  (when-some [data (lookup-entry config id :rendering-properties)]
    (. builder renderingProperties data))
  (.build builder))


(defn metric-config-builder
  "Creates a  `MetricConfig$Builder` instance using a no-argument constructor, applies the data configuration using the [[metric-config-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (metric-config-builder> (new MetricConfig$Builder) id config))


(defn metric-expression-config-builder>
  "The metric-expression-config-builder> function updates a MetricExpressionConfig$Builder instance using the provided configuration.
  The function takes the MetricExpressionConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `period` | java.lang.Number | [[cdk.support/lookup-entry]] | `:period` |
| `searchAccount` | java.lang.String | [[cdk.support/lookup-entry]] | `:search-account` |
| `searchRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:search-region` |
| `usingMetrics` | java.util.Map | [[cdk.support/lookup-entry]] | `:using-metrics` |
"
  [^MetricExpressionConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :expression)]
    (. builder expression data))
  (when-some [data (lookup-entry config id :period)]
    (. builder period data))
  (when-some [data (lookup-entry config id :search-account)]
    (. builder searchAccount data))
  (when-some [data (lookup-entry config id :search-region)]
    (. builder searchRegion data))
  (when-some [data (lookup-entry config id :using-metrics)]
    (. builder usingMetrics data))
  (.build builder))


(defn metric-expression-config-builder
  "Creates a  `MetricExpressionConfig$Builder` instance using a no-argument constructor, applies the data configuration using the [[metric-expression-config-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (metric-expression-config-builder> (new MetricExpressionConfig$Builder) id config))


(defn metric-options-builder>
  "The metric-options-builder> function updates a MetricOptions$Builder instance using the provided configuration.
  The function takes the MetricOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `color` | java.lang.String | [[cdk.support/lookup-entry]] | `:color` |
| `dimensionsMap` | java.util.Map | [[cdk.support/lookup-entry]] | `:dimensions-map` |
| `label` | java.lang.String | [[cdk.support/lookup-entry]] | `:label` |
| `period` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:period` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `statistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:statistic` |
| `unit` | software.amazon.awscdk.services.cloudwatch.Unit | [[cdk.api.services.cloudwatch/unit]] | `:unit` |
"
  [^MetricOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :account)]
    (. builder account data))
  (when-some [data (lookup-entry config id :color)]
    (. builder color data))
  (when-some [data (lookup-entry config id :dimensions-map)]
    (. builder dimensionsMap data))
  (when-some [data (lookup-entry config id :label)]
    (. builder label data))
  (when-some [data (lookup-entry config id :period)]
    (. builder period data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :statistic)]
    (. builder statistic data))
  (when-some [data (unit config id :unit)]
    (. builder unit data))
  (.build builder))


(defn metric-options-builder
  "Creates a  `MetricOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[metric-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (metric-options-builder> (new MetricOptions$Builder) id config))


(defn metric-props-builder>
  "The metric-props-builder> function updates a MetricProps$Builder instance using the provided configuration.
  The function takes the MetricProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `color` | java.lang.String | [[cdk.support/lookup-entry]] | `:color` |
| `dimensionsMap` | java.util.Map | [[cdk.support/lookup-entry]] | `:dimensions-map` |
| `label` | java.lang.String | [[cdk.support/lookup-entry]] | `:label` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `period` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:period` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `statistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:statistic` |
| `unit` | software.amazon.awscdk.services.cloudwatch.Unit | [[cdk.api.services.cloudwatch/unit]] | `:unit` |
"
  [^MetricProps$Builder builder id config]
  (when-some [data (lookup-entry config id :account)]
    (. builder account data))
  (when-some [data (lookup-entry config id :color)]
    (. builder color data))
  (when-some [data (lookup-entry config id :dimensions-map)]
    (. builder dimensionsMap data))
  (when-some [data (lookup-entry config id :label)]
    (. builder label data))
  (when-some [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-some [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (when-some [data (lookup-entry config id :period)]
    (. builder period data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :statistic)]
    (. builder statistic data))
  (when-some [data (unit config id :unit)]
    (. builder unit data))
  (.build builder))


(defn metric-props-builder
  "Creates a  `MetricProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[metric-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (metric-props-builder> (new MetricProps$Builder) id config))


(defn metric-stat-config-builder>
  "The metric-stat-config-builder> function updates a MetricStatConfig$Builder instance using the provided configuration.
  The function takes the MetricStatConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `dimensions` | java.util.List | [[cdk.support/lookup-entry]] | `:dimensions` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `period` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:period` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `statistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:statistic` |
| `unitFilter` | software.amazon.awscdk.services.cloudwatch.Unit | [[cdk.api.services.cloudwatch/unit]] | `:unit-filter` |
"
  [^MetricStatConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :account)]
    (. builder account data))
  (when-some [data (lookup-entry config id :dimensions)]
    (. builder dimensions data))
  (when-some [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-some [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (when-some [data (lookup-entry config id :period)]
    (. builder period data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :statistic)]
    (. builder statistic data))
  (when-some [data (unit config id :unit-filter)]
    (. builder unitFilter data))
  (.build builder))


(defn metric-stat-config-builder
  "Creates a  `MetricStatConfig$Builder` instance using a no-argument constructor, applies the data configuration using the [[metric-stat-config-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (metric-stat-config-builder> (new MetricStatConfig$Builder) id config))


(defn metric-widget-props-builder>
  "The metric-widget-props-builder> function updates a MetricWidgetProps$Builder instance using the provided configuration.
  The function takes the MetricWidgetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |
"
  [^MetricWidgetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :height)]
    (. builder height data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :title)]
    (. builder title data))
  (when-some [data (lookup-entry config id :width)]
    (. builder width data))
  (.build builder))


(defn metric-widget-props-builder
  "Creates a  `MetricWidgetProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[metric-widget-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (metric-widget-props-builder> (new MetricWidgetProps$Builder) id config))


(defn search-components-builder>
  "The search-components-builder> function updates a SearchComponents$Builder instance using the provided configuration.
  The function takes the SearchComponents$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimensions` | java.util.List | [[cdk.support/lookup-entry]] | `:dimensions` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `populateFrom` | java.lang.String | [[cdk.support/lookup-entry]] | `:populate-from` |
"
  [^SearchComponents$Builder builder id config]
  (when-some [data (lookup-entry config id :dimensions)]
    (. builder dimensions data))
  (when-some [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-some [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (when-some [data (lookup-entry config id :populate-from)]
    (. builder populateFrom data))
  (.build builder))


(defn search-components-builder
  "Creates a  `SearchComponents$Builder` instance using a no-argument constructor, applies the data configuration using the [[search-components-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (search-components-builder> (new SearchComponents$Builder) id config))


(defn single-value-widget-builder>
  "The single-value-widget-builder> function updates a SingleValueWidget$Builder instance using the provided configuration.
  The function takes the SingleValueWidget$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `end` | java.lang.String | [[cdk.support/lookup-entry]] | `:end` |
| `fullPrecision` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:full-precision` |
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `metrics` | java.util.List | [[cdk.support/lookup-entry]] | `:metrics` |
| `period` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:period` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `setPeriodToTimeRange` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:set-period-to-time-range` |
| `sparkline` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:sparkline` |
| `start` | java.lang.String | [[cdk.support/lookup-entry]] | `:start` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |
"
  [^SingleValueWidget$Builder builder id config]
  (when-some [data (lookup-entry config id :end)]
    (. builder end data))
  (when-some [data (lookup-entry config id :full-precision)]
    (. builder fullPrecision data))
  (when-some [data (lookup-entry config id :height)]
    (. builder height data))
  (when-some [data (lookup-entry config id :metrics)]
    (. builder metrics data))
  (when-some [data (lookup-entry config id :period)]
    (. builder period data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :set-period-to-time-range)]
    (. builder setPeriodToTimeRange data))
  (when-some [data (lookup-entry config id :sparkline)]
    (. builder sparkline data))
  (when-some [data (lookup-entry config id :start)]
    (. builder start data))
  (when-some [data (lookup-entry config id :title)]
    (. builder title data))
  (when-some [data (lookup-entry config id :width)]
    (. builder width data))
  (.build builder))


(defn single-value-widget-builder
  "Creates a  `SingleValueWidget$Builder` instance using a no-argument create, applies the data configuration using the [[single-value-widget-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (single-value-widget-builder> (SingleValueWidget$Builder/create) id config))


(defn single-value-widget-props-builder>
  "The single-value-widget-props-builder> function updates a SingleValueWidgetProps$Builder instance using the provided configuration.
  The function takes the SingleValueWidgetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `end` | java.lang.String | [[cdk.support/lookup-entry]] | `:end` |
| `fullPrecision` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:full-precision` |
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `metrics` | java.util.List | [[cdk.support/lookup-entry]] | `:metrics` |
| `period` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:period` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `setPeriodToTimeRange` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:set-period-to-time-range` |
| `sparkline` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:sparkline` |
| `start` | java.lang.String | [[cdk.support/lookup-entry]] | `:start` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |
"
  [^SingleValueWidgetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :end)]
    (. builder end data))
  (when-some [data (lookup-entry config id :full-precision)]
    (. builder fullPrecision data))
  (when-some [data (lookup-entry config id :height)]
    (. builder height data))
  (when-some [data (lookup-entry config id :metrics)]
    (. builder metrics data))
  (when-some [data (lookup-entry config id :period)]
    (. builder period data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :set-period-to-time-range)]
    (. builder setPeriodToTimeRange data))
  (when-some [data (lookup-entry config id :sparkline)]
    (. builder sparkline data))
  (when-some [data (lookup-entry config id :start)]
    (. builder start data))
  (when-some [data (lookup-entry config id :title)]
    (. builder title data))
  (when-some [data (lookup-entry config id :width)]
    (. builder width data))
  (.build builder))


(defn single-value-widget-props-builder
  "Creates a  `SingleValueWidgetProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[single-value-widget-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (single-value-widget-props-builder> (new SingleValueWidgetProps$Builder) id config))


(defn spacer-builder>
  "The spacer-builder> function updates a Spacer$Builder instance using the provided configuration.
  The function takes the Spacer$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |
"
  [^Spacer$Builder builder id config]
  (when-some [data (lookup-entry config id :height)]
    (. builder height data))
  (when-some [data (lookup-entry config id :width)]
    (. builder width data))
  (.build builder))


(defn spacer-builder
  "Creates a  `Spacer$Builder` instance using a no-argument create, applies the data configuration using the [[spacer-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (spacer-builder> (Spacer$Builder/create) id config))


(defn spacer-props-builder>
  "The spacer-props-builder> function updates a SpacerProps$Builder instance using the provided configuration.
  The function takes the SpacerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |
"
  [^SpacerProps$Builder builder id config]
  (when-some [data (lookup-entry config id :height)]
    (. builder height data))
  (when-some [data (lookup-entry config id :width)]
    (. builder width data))
  (.build builder))


(defn spacer-props-builder
  "Creates a  `SpacerProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[spacer-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (spacer-props-builder> (new SpacerProps$Builder) id config))


(defn table-summary-props-builder>
  "The table-summary-props-builder> function updates a TableSummaryProps$Builder instance using the provided configuration.
  The function takes the TableSummaryProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `columns` | java.util.List | [[cdk.support/lookup-entry]] | `:columns` |
| `hideNonSummaryColumns` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:hide-non-summary-columns` |
| `sticky` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:sticky` |
"
  [^TableSummaryProps$Builder builder id config]
  (when-some [data (lookup-entry config id :columns)]
    (. builder columns data))
  (when-some [data (lookup-entry config id :hide-non-summary-columns)]
    (. builder hideNonSummaryColumns data))
  (when-some [data (lookup-entry config id :sticky)]
    (. builder sticky data))
  (.build builder))


(defn table-summary-props-builder
  "Creates a  `TableSummaryProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[table-summary-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (table-summary-props-builder> (new TableSummaryProps$Builder) id config))


(defn table-widget-builder>
  "The table-widget-builder> function updates a TableWidget$Builder instance using the provided configuration.
  The function takes the TableWidget$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `end` | java.lang.String | [[cdk.support/lookup-entry]] | `:end` |
| `fullPrecision` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:full-precision` |
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `layout` | software.amazon.awscdk.services.cloudwatch.TableLayout | [[cdk.api.services.cloudwatch/table-layout]] | `:layout` |
| `liveData` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:live-data` |
| `metrics` | java.util.List | [[cdk.support/lookup-entry]] | `:metrics` |
| `period` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:period` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `setPeriodToTimeRange` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:set-period-to-time-range` |
| `showUnitsInLabel` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:show-units-in-label` |
| `start` | java.lang.String | [[cdk.support/lookup-entry]] | `:start` |
| `statistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:statistic` |
| `summary` | software.amazon.awscdk.services.cloudwatch.TableSummaryProps | [[cdk.support/lookup-entry]] | `:summary` |
| `thresholds` | java.util.List | [[cdk.support/lookup-entry]] | `:thresholds` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |
"
  [^TableWidget$Builder builder id config]
  (when-some [data (lookup-entry config id :end)]
    (. builder end data))
  (when-some [data (lookup-entry config id :full-precision)]
    (. builder fullPrecision data))
  (when-some [data (lookup-entry config id :height)]
    (. builder height data))
  (when-some [data (table-layout config id :layout)]
    (. builder layout data))
  (when-some [data (lookup-entry config id :live-data)]
    (. builder liveData data))
  (when-some [data (lookup-entry config id :metrics)]
    (. builder metrics data))
  (when-some [data (lookup-entry config id :period)]
    (. builder period data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :set-period-to-time-range)]
    (. builder setPeriodToTimeRange data))
  (when-some [data (lookup-entry config id :show-units-in-label)]
    (. builder showUnitsInLabel data))
  (when-some [data (lookup-entry config id :start)]
    (. builder start data))
  (when-some [data (lookup-entry config id :statistic)]
    (. builder statistic data))
  (when-some [data (lookup-entry config id :summary)]
    (. builder summary data))
  (when-some [data (lookup-entry config id :thresholds)]
    (. builder thresholds data))
  (when-some [data (lookup-entry config id :title)]
    (. builder title data))
  (when-some [data (lookup-entry config id :width)]
    (. builder width data))
  (.build builder))


(defn table-widget-builder
  "Creates a  `TableWidget$Builder` instance using a no-argument create, applies the data configuration using the [[table-widget-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (table-widget-builder> (TableWidget$Builder/create) id config))


(defn table-widget-props-builder>
  "The table-widget-props-builder> function updates a TableWidgetProps$Builder instance using the provided configuration.
  The function takes the TableWidgetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `end` | java.lang.String | [[cdk.support/lookup-entry]] | `:end` |
| `fullPrecision` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:full-precision` |
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `layout` | software.amazon.awscdk.services.cloudwatch.TableLayout | [[cdk.api.services.cloudwatch/table-layout]] | `:layout` |
| `liveData` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:live-data` |
| `metrics` | java.util.List | [[cdk.support/lookup-entry]] | `:metrics` |
| `period` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:period` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `setPeriodToTimeRange` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:set-period-to-time-range` |
| `showUnitsInLabel` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:show-units-in-label` |
| `start` | java.lang.String | [[cdk.support/lookup-entry]] | `:start` |
| `statistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:statistic` |
| `summary` | software.amazon.awscdk.services.cloudwatch.TableSummaryProps | [[cdk.support/lookup-entry]] | `:summary` |
| `thresholds` | java.util.List | [[cdk.support/lookup-entry]] | `:thresholds` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |
"
  [^TableWidgetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :end)]
    (. builder end data))
  (when-some [data (lookup-entry config id :full-precision)]
    (. builder fullPrecision data))
  (when-some [data (lookup-entry config id :height)]
    (. builder height data))
  (when-some [data (table-layout config id :layout)]
    (. builder layout data))
  (when-some [data (lookup-entry config id :live-data)]
    (. builder liveData data))
  (when-some [data (lookup-entry config id :metrics)]
    (. builder metrics data))
  (when-some [data (lookup-entry config id :period)]
    (. builder period data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :set-period-to-time-range)]
    (. builder setPeriodToTimeRange data))
  (when-some [data (lookup-entry config id :show-units-in-label)]
    (. builder showUnitsInLabel data))
  (when-some [data (lookup-entry config id :start)]
    (. builder start data))
  (when-some [data (lookup-entry config id :statistic)]
    (. builder statistic data))
  (when-some [data (lookup-entry config id :summary)]
    (. builder summary data))
  (when-some [data (lookup-entry config id :thresholds)]
    (. builder thresholds data))
  (when-some [data (lookup-entry config id :title)]
    (. builder title data))
  (when-some [data (lookup-entry config id :width)]
    (. builder width data))
  (.build builder))


(defn table-widget-props-builder
  "Creates a  `TableWidgetProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[table-widget-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (table-widget-props-builder> (new TableWidgetProps$Builder) id config))


(defn text-widget-builder>
  "The text-widget-builder> function updates a TextWidget$Builder instance using the provided configuration.
  The function takes the TextWidget$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `background` | software.amazon.awscdk.services.cloudwatch.TextWidgetBackground | [[cdk.api.services.cloudwatch/text-widget-background]] | `:background` |
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `markdown` | java.lang.String | [[cdk.support/lookup-entry]] | `:markdown` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |
"
  [^TextWidget$Builder builder id config]
  (when-some [data (text-widget-background config id :background)]
    (. builder background data))
  (when-some [data (lookup-entry config id :height)]
    (. builder height data))
  (when-some [data (lookup-entry config id :markdown)]
    (. builder markdown data))
  (when-some [data (lookup-entry config id :width)]
    (. builder width data))
  (.build builder))


(defn text-widget-builder
  "Creates a  `TextWidget$Builder` instance using a no-argument create, applies the data configuration using the [[text-widget-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (text-widget-builder> (TextWidget$Builder/create) id config))


(defn text-widget-props-builder>
  "The text-widget-props-builder> function updates a TextWidgetProps$Builder instance using the provided configuration.
  The function takes the TextWidgetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `background` | software.amazon.awscdk.services.cloudwatch.TextWidgetBackground | [[cdk.api.services.cloudwatch/text-widget-background]] | `:background` |
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `markdown` | java.lang.String | [[cdk.support/lookup-entry]] | `:markdown` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |
"
  [^TextWidgetProps$Builder builder id config]
  (when-some [data (text-widget-background config id :background)]
    (. builder background data))
  (when-some [data (lookup-entry config id :height)]
    (. builder height data))
  (when-some [data (lookup-entry config id :markdown)]
    (. builder markdown data))
  (when-some [data (lookup-entry config id :width)]
    (. builder width data))
  (.build builder))


(defn text-widget-props-builder
  "Creates a  `TextWidgetProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[text-widget-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (text-widget-props-builder> (new TextWidgetProps$Builder) id config))


(defn variable-value-builder>
  "The variable-value-builder> function updates a VariableValue$Builder instance using the provided configuration.
  The function takes the VariableValue$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `label` | java.lang.String | [[cdk.support/lookup-entry]] | `:label` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^VariableValue$Builder builder id config]
  (when-some [data (lookup-entry config id :label)]
    (. builder label data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn variable-value-builder
  "Creates a  `VariableValue$Builder` instance using a no-argument constructor, applies the data configuration using the [[variable-value-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (variable-value-builder> (new VariableValue$Builder) id config))


(defn vertical-annotation-builder>
  "The vertical-annotation-builder> function updates a VerticalAnnotation$Builder instance using the provided configuration.
  The function takes the VerticalAnnotation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `color` | java.lang.String | [[cdk.support/lookup-entry]] | `:color` |
| `date` | java.lang.String | [[cdk.support/lookup-entry]] | `:date` |
| `fill` | software.amazon.awscdk.services.cloudwatch.VerticalShading | [[cdk.api.services.cloudwatch/vertical-shading]] | `:fill` |
| `label` | java.lang.String | [[cdk.support/lookup-entry]] | `:label` |
| `visible` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:visible` |
"
  [^VerticalAnnotation$Builder builder id config]
  (when-some [data (lookup-entry config id :color)]
    (. builder color data))
  (when-some [data (lookup-entry config id :date)]
    (. builder date data))
  (when-some [data (vertical-shading config id :fill)]
    (. builder fill data))
  (when-some [data (lookup-entry config id :label)]
    (. builder label data))
  (when-some [data (lookup-entry config id :visible)]
    (. builder visible data))
  (.build builder))


(defn vertical-annotation-builder
  "Creates a  `VerticalAnnotation$Builder` instance using a no-argument constructor, applies the data configuration using the [[vertical-annotation-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (vertical-annotation-builder> (new VerticalAnnotation$Builder) id config))


(defn y-axis-props-builder>
  "The y-axis-props-builder> function updates a YAxisProps$Builder instance using the provided configuration.
  The function takes the YAxisProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `label` | java.lang.String | [[cdk.support/lookup-entry]] | `:label` |
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |
| `showUnits` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:show-units` |
"
  [^YAxisProps$Builder builder id config]
  (when-some [data (lookup-entry config id :label)]
    (. builder label data))
  (when-some [data (lookup-entry config id :max)]
    (. builder max data))
  (when-some [data (lookup-entry config id :min)]
    (. builder min data))
  (when-some [data (lookup-entry config id :show-units)]
    (. builder showUnits data))
  (.build builder))


(defn y-axis-props-builder
  "Creates a  `YAxisProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[y-axis-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (y-axis-props-builder> (new YAxisProps$Builder) id config))