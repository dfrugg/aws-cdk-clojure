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


(defn alarm-action-config-builder
  "The alarm-action-config-builder function buildes out new instances of 
AlarmActionConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarmActionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-action-arn` |"
  [stack id config]
  (let [builder (AlarmActionConfig$Builder.)]
    (when-let [data (lookup-entry config id :alarm-action-arn)]
      (. builder alarmActionArn data))
    (.build builder)))


(defn alarm-builder
  "The alarm-builder function buildes out new instances of 
Alarm$Builder using the provided configuration.  Each field is set as follows:

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
| `treatMissingData` | software.amazon.awscdk.services.cloudwatch.TreatMissingData | [[cdk.api.services.cloudwatch/treat-missing-data]] | `:treat-missing-data` |"
  [stack id config]
  (let [builder (Alarm$Builder/create stack id)]
    (when-let [data (lookup-entry config id :actions-enabled)]
      (. builder actionsEnabled data))
    (when-let [data (lookup-entry config id :alarm-description)]
      (. builder alarmDescription data))
    (when-let [data (lookup-entry config id :alarm-name)]
      (. builder alarmName data))
    (when-let [data (comparison-operator config id :comparison-operator)]
      (. builder comparisonOperator data))
    (when-let [data (lookup-entry config id :datapoints-to-alarm)]
      (. builder datapointsToAlarm data))
    (when-let [data (lookup-entry config id :evaluate-low-sample-count-percentile)]
      (. builder evaluateLowSampleCountPercentile data))
    (when-let [data (lookup-entry config id :evaluation-periods)]
      (. builder evaluationPeriods data))
    (when-let [data (lookup-entry config id :metric)]
      (. builder metric data))
    (when-let [data (lookup-entry config id :threshold)]
      (. builder threshold data))
    (when-let [data (treat-missing-data config id :treat-missing-data)]
      (. builder treatMissingData data))
    (.build builder)))


(defn alarm-props-builder
  "The alarm-props-builder function buildes out new instances of 
AlarmProps$Builder using the provided configuration.  Each field is set as follows:

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
| `treatMissingData` | software.amazon.awscdk.services.cloudwatch.TreatMissingData | [[cdk.api.services.cloudwatch/treat-missing-data]] | `:treat-missing-data` |"
  [stack id config]
  (let [builder (AlarmProps$Builder.)]
    (when-let [data (lookup-entry config id :actions-enabled)]
      (. builder actionsEnabled data))
    (when-let [data (lookup-entry config id :alarm-description)]
      (. builder alarmDescription data))
    (when-let [data (lookup-entry config id :alarm-name)]
      (. builder alarmName data))
    (when-let [data (comparison-operator config id :comparison-operator)]
      (. builder comparisonOperator data))
    (when-let [data (lookup-entry config id :datapoints-to-alarm)]
      (. builder datapointsToAlarm data))
    (when-let [data (lookup-entry config id :evaluate-low-sample-count-percentile)]
      (. builder evaluateLowSampleCountPercentile data))
    (when-let [data (lookup-entry config id :evaluation-periods)]
      (. builder evaluationPeriods data))
    (when-let [data (lookup-entry config id :metric)]
      (. builder metric data))
    (when-let [data (lookup-entry config id :threshold)]
      (. builder threshold data))
    (when-let [data (treat-missing-data config id :treat-missing-data)]
      (. builder treatMissingData data))
    (.build builder)))


(defn alarm-status-widget-builder
  "The alarm-status-widget-builder function buildes out new instances of 
AlarmStatusWidget$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarms` | java.util.List | [[cdk.support/lookup-entry]] | `:alarms` |
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `sortBy` | software.amazon.awscdk.services.cloudwatch.AlarmStatusWidgetSortBy | [[cdk.api.services.cloudwatch/alarm-status-widget-sort-by]] | `:sort-by` |
| `states` | java.util.List | [[cdk.support/lookup-entry]] | `:states` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |"
  [stack id config]
  (let [builder (AlarmStatusWidget$Builder/create)]
    (when-let [data (lookup-entry config id :alarms)]
      (. builder alarms data))
    (when-let [data (lookup-entry config id :height)]
      (. builder height data))
    (when-let [data (alarm-status-widget-sort-by config id :sort-by)]
      (. builder sortBy data))
    (when-let [data (lookup-entry config id :states)]
      (. builder states data))
    (when-let [data (lookup-entry config id :title)]
      (. builder title data))
    (when-let [data (lookup-entry config id :width)]
      (. builder width data))
    (.build builder)))


(defn alarm-status-widget-props-builder
  "The alarm-status-widget-props-builder function buildes out new instances of 
AlarmStatusWidgetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarms` | java.util.List | [[cdk.support/lookup-entry]] | `:alarms` |
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `sortBy` | software.amazon.awscdk.services.cloudwatch.AlarmStatusWidgetSortBy | [[cdk.api.services.cloudwatch/alarm-status-widget-sort-by]] | `:sort-by` |
| `states` | java.util.List | [[cdk.support/lookup-entry]] | `:states` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |"
  [stack id config]
  (let [builder (AlarmStatusWidgetProps$Builder.)]
    (when-let [data (lookup-entry config id :alarms)]
      (. builder alarms data))
    (when-let [data (lookup-entry config id :height)]
      (. builder height data))
    (when-let [data (alarm-status-widget-sort-by config id :sort-by)]
      (. builder sortBy data))
    (when-let [data (lookup-entry config id :states)]
      (. builder states data))
    (when-let [data (lookup-entry config id :title)]
      (. builder title data))
    (when-let [data (lookup-entry config id :width)]
      (. builder width data))
    (.build builder)))


(defn alarm-widget-builder
  "The alarm-widget-builder function buildes out new instances of 
AlarmWidget$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarm` | software.amazon.awscdk.services.cloudwatch.IAlarm | [[cdk.support/lookup-entry]] | `:alarm` |
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `leftYAxis` | software.amazon.awscdk.services.cloudwatch.YAxisProps | [[cdk.support/lookup-entry]] | `:left-y-axis` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |"
  [stack id config]
  (let [builder (AlarmWidget$Builder/create)]
    (when-let [data (lookup-entry config id :alarm)]
      (. builder alarm data))
    (when-let [data (lookup-entry config id :height)]
      (. builder height data))
    (when-let [data (lookup-entry config id :left-y-axis)]
      (. builder leftYAxis data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :title)]
      (. builder title data))
    (when-let [data (lookup-entry config id :width)]
      (. builder width data))
    (.build builder)))


(defn alarm-widget-props-builder
  "The alarm-widget-props-builder function buildes out new instances of 
AlarmWidgetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarm` | software.amazon.awscdk.services.cloudwatch.IAlarm | [[cdk.support/lookup-entry]] | `:alarm` |
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `leftYAxis` | software.amazon.awscdk.services.cloudwatch.YAxisProps | [[cdk.support/lookup-entry]] | `:left-y-axis` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |"
  [stack id config]
  (let [builder (AlarmWidgetProps$Builder.)]
    (when-let [data (lookup-entry config id :alarm)]
      (. builder alarm data))
    (when-let [data (lookup-entry config id :height)]
      (. builder height data))
    (when-let [data (lookup-entry config id :left-y-axis)]
      (. builder leftYAxis data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :title)]
      (. builder title data))
    (when-let [data (lookup-entry config id :width)]
      (. builder width data))
    (.build builder)))


(defn cfn-alarm-builder
  "The cfn-alarm-builder function buildes out new instances of 
CfnAlarm$Builder using the provided configuration.  Each field is set as follows:

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
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |"
  [stack id config]
  (let [builder (CfnAlarm$Builder/create stack id)]
    (when-let [data (lookup-entry config id :actions-enabled)]
      (. builder actionsEnabled data))
    (when-let [data (lookup-entry config id :alarm-actions)]
      (. builder alarmActions data))
    (when-let [data (lookup-entry config id :alarm-description)]
      (. builder alarmDescription data))
    (when-let [data (lookup-entry config id :alarm-name)]
      (. builder alarmName data))
    (when-let [data (lookup-entry config id :comparison-operator)]
      (. builder comparisonOperator data))
    (when-let [data (lookup-entry config id :datapoints-to-alarm)]
      (. builder datapointsToAlarm data))
    (when-let [data (lookup-entry config id :dimensions)]
      (. builder dimensions data))
    (when-let [data (lookup-entry config id :evaluate-low-sample-count-percentile)]
      (. builder evaluateLowSampleCountPercentile data))
    (when-let [data (lookup-entry config id :evaluation-periods)]
      (. builder evaluationPeriods data))
    (when-let [data (lookup-entry config id :extended-statistic)]
      (. builder extendedStatistic data))
    (when-let [data (lookup-entry config id :insufficient-data-actions)]
      (. builder insufficientDataActions data))
    (when-let [data (lookup-entry config id :metric-name)]
      (. builder metricName data))
    (when-let [data (lookup-entry config id :metrics)]
      (. builder metrics data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (when-let [data (lookup-entry config id :ok-actions)]
      (. builder okActions data))
    (when-let [data (lookup-entry config id :period)]
      (. builder period data))
    (when-let [data (lookup-entry config id :statistic)]
      (. builder statistic data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :threshold)]
      (. builder threshold data))
    (when-let [data (lookup-entry config id :threshold-metric-id)]
      (. builder thresholdMetricId data))
    (when-let [data (lookup-entry config id :treat-missing-data)]
      (. builder treatMissingData data))
    (when-let [data (lookup-entry config id :unit)]
      (. builder unit data))
    (.build builder)))


(defn cfn-alarm-dimension-property-builder
  "The cfn-alarm-dimension-property-builder function buildes out new instances of 
CfnAlarm$DimensionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnAlarm$DimensionProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-alarm-metric-data-query-property-builder
  "The cfn-alarm-metric-data-query-property-builder function buildes out new instances of 
CfnAlarm$MetricDataQueryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `label` | java.lang.String | [[cdk.support/lookup-entry]] | `:label` |
| `metricStat` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:metric-stat` |
| `period` | java.lang.Number | [[cdk.support/lookup-entry]] | `:period` |
| `returnData` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:return-data` |"
  [stack id config]
  (let [builder (CfnAlarm$MetricDataQueryProperty$Builder.)]
    (when-let [data (lookup-entry config id :account-id)]
      (. builder accountId data))
    (when-let [data (lookup-entry config id :expression)]
      (. builder expression data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :label)]
      (. builder label data))
    (when-let [data (lookup-entry config id :metric-stat)]
      (. builder metricStat data))
    (when-let [data (lookup-entry config id :period)]
      (. builder period data))
    (when-let [data (lookup-entry config id :return-data)]
      (. builder returnData data))
    (.build builder)))


(defn cfn-alarm-metric-property-builder
  "The cfn-alarm-metric-property-builder function buildes out new instances of 
CfnAlarm$MetricProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimensions` | java.util.List | [[cdk.support/lookup-entry]] | `:dimensions` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |"
  [stack id config]
  (let [builder (CfnAlarm$MetricProperty$Builder.)]
    (when-let [data (lookup-entry config id :dimensions)]
      (. builder dimensions data))
    (when-let [data (lookup-entry config id :metric-name)]
      (. builder metricName data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (.build builder)))


(defn cfn-alarm-metric-stat-property-builder
  "The cfn-alarm-metric-stat-property-builder function buildes out new instances of 
CfnAlarm$MetricStatProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metric` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:metric` |
| `period` | java.lang.Number | [[cdk.support/lookup-entry]] | `:period` |
| `stat` | java.lang.String | [[cdk.support/lookup-entry]] | `:stat` |
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |"
  [stack id config]
  (let [builder (CfnAlarm$MetricStatProperty$Builder.)]
    (when-let [data (lookup-entry config id :metric)]
      (. builder metric data))
    (when-let [data (lookup-entry config id :period)]
      (. builder period data))
    (when-let [data (lookup-entry config id :stat)]
      (. builder stat data))
    (when-let [data (lookup-entry config id :unit)]
      (. builder unit data))
    (.build builder)))


(defn cfn-alarm-props-builder
  "The cfn-alarm-props-builder function buildes out new instances of 
CfnAlarmProps$Builder using the provided configuration.  Each field is set as follows:

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
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |"
  [stack id config]
  (let [builder (CfnAlarmProps$Builder.)]
    (when-let [data (lookup-entry config id :actions-enabled)]
      (. builder actionsEnabled data))
    (when-let [data (lookup-entry config id :alarm-actions)]
      (. builder alarmActions data))
    (when-let [data (lookup-entry config id :alarm-description)]
      (. builder alarmDescription data))
    (when-let [data (lookup-entry config id :alarm-name)]
      (. builder alarmName data))
    (when-let [data (lookup-entry config id :comparison-operator)]
      (. builder comparisonOperator data))
    (when-let [data (lookup-entry config id :datapoints-to-alarm)]
      (. builder datapointsToAlarm data))
    (when-let [data (lookup-entry config id :dimensions)]
      (. builder dimensions data))
    (when-let [data (lookup-entry config id :evaluate-low-sample-count-percentile)]
      (. builder evaluateLowSampleCountPercentile data))
    (when-let [data (lookup-entry config id :evaluation-periods)]
      (. builder evaluationPeriods data))
    (when-let [data (lookup-entry config id :extended-statistic)]
      (. builder extendedStatistic data))
    (when-let [data (lookup-entry config id :insufficient-data-actions)]
      (. builder insufficientDataActions data))
    (when-let [data (lookup-entry config id :metric-name)]
      (. builder metricName data))
    (when-let [data (lookup-entry config id :metrics)]
      (. builder metrics data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (when-let [data (lookup-entry config id :ok-actions)]
      (. builder okActions data))
    (when-let [data (lookup-entry config id :period)]
      (. builder period data))
    (when-let [data (lookup-entry config id :statistic)]
      (. builder statistic data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :threshold)]
      (. builder threshold data))
    (when-let [data (lookup-entry config id :threshold-metric-id)]
      (. builder thresholdMetricId data))
    (when-let [data (lookup-entry config id :treat-missing-data)]
      (. builder treatMissingData data))
    (when-let [data (lookup-entry config id :unit)]
      (. builder unit data))
    (.build builder)))


(defn cfn-anomaly-detector-builder
  "The cfn-anomaly-detector-builder function buildes out new instances of 
CfnAnomalyDetector$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configuration` |
| `dimensions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dimensions` |
| `metricCharacteristics` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:metric-characteristics` |
| `metricMathAnomalyDetector` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:metric-math-anomaly-detector` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `singleMetricAnomalyDetector` | software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector$SingleMetricAnomalyDetectorProperty | [[cdk.support/lookup-entry]] | `:single-metric-anomaly-detector` |
| `stat` | java.lang.String | [[cdk.support/lookup-entry]] | `:stat` |"
  [stack id config]
  (let [builder (CfnAnomalyDetector$Builder/create stack id)]
    (when-let [data (lookup-entry config id :configuration)]
      (. builder configuration data))
    (when-let [data (lookup-entry config id :dimensions)]
      (. builder dimensions data))
    (when-let [data (lookup-entry config id :metric-characteristics)]
      (. builder metricCharacteristics data))
    (when-let [data (lookup-entry config id :metric-math-anomaly-detector)]
      (. builder metricMathAnomalyDetector data))
    (when-let [data (lookup-entry config id :metric-name)]
      (. builder metricName data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (when-let [data (lookup-entry config id :single-metric-anomaly-detector)]
      (. builder singleMetricAnomalyDetector data))
    (when-let [data (lookup-entry config id :stat)]
      (. builder stat data))
    (.build builder)))


(defn cfn-anomaly-detector-configuration-property-builder
  "The cfn-anomaly-detector-configuration-property-builder function buildes out new instances of 
CfnAnomalyDetector$ConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludedTimeRanges` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:excluded-time-ranges` |
| `metricTimeZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-time-zone` |"
  [stack id config]
  (let [builder (CfnAnomalyDetector$ConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :excluded-time-ranges)]
      (. builder excludedTimeRanges data))
    (when-let [data (lookup-entry config id :metric-time-zone)]
      (. builder metricTimeZone data))
    (.build builder)))


(defn cfn-anomaly-detector-dimension-property-builder
  "The cfn-anomaly-detector-dimension-property-builder function buildes out new instances of 
CfnAnomalyDetector$DimensionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnAnomalyDetector$DimensionProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-anomaly-detector-metric-characteristics-property-builder
  "The cfn-anomaly-detector-metric-characteristics-property-builder function buildes out new instances of 
CfnAnomalyDetector$MetricCharacteristicsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `periodicSpikes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:periodic-spikes` |"
  [stack id config]
  (let [builder (CfnAnomalyDetector$MetricCharacteristicsProperty$Builder.)]
    (when-let [data (lookup-entry config id :periodic-spikes)]
      (. builder periodicSpikes data))
    (.build builder)))


(defn cfn-anomaly-detector-metric-data-query-property-builder
  "The cfn-anomaly-detector-metric-data-query-property-builder function buildes out new instances of 
CfnAnomalyDetector$MetricDataQueryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `label` | java.lang.String | [[cdk.support/lookup-entry]] | `:label` |
| `metricStat` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:metric-stat` |
| `period` | java.lang.Number | [[cdk.support/lookup-entry]] | `:period` |
| `returnData` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:return-data` |"
  [stack id config]
  (let [builder (CfnAnomalyDetector$MetricDataQueryProperty$Builder.)]
    (when-let [data (lookup-entry config id :account-id)]
      (. builder accountId data))
    (when-let [data (lookup-entry config id :expression)]
      (. builder expression data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :label)]
      (. builder label data))
    (when-let [data (lookup-entry config id :metric-stat)]
      (. builder metricStat data))
    (when-let [data (lookup-entry config id :period)]
      (. builder period data))
    (when-let [data (lookup-entry config id :return-data)]
      (. builder returnData data))
    (.build builder)))


(defn cfn-anomaly-detector-metric-math-anomaly-detector-property-builder
  "The cfn-anomaly-detector-metric-math-anomaly-detector-property-builder function buildes out new instances of 
CfnAnomalyDetector$MetricMathAnomalyDetectorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metricDataQueries` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:metric-data-queries` |"
  [stack id config]
  (let [builder (CfnAnomalyDetector$MetricMathAnomalyDetectorProperty$Builder.)]
    (when-let [data (lookup-entry config id :metric-data-queries)]
      (. builder metricDataQueries data))
    (.build builder)))


(defn cfn-anomaly-detector-metric-property-builder
  "The cfn-anomaly-detector-metric-property-builder function buildes out new instances of 
CfnAnomalyDetector$MetricProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimensions` | java.util.List | [[cdk.support/lookup-entry]] | `:dimensions` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |"
  [stack id config]
  (let [builder (CfnAnomalyDetector$MetricProperty$Builder.)]
    (when-let [data (lookup-entry config id :dimensions)]
      (. builder dimensions data))
    (when-let [data (lookup-entry config id :metric-name)]
      (. builder metricName data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (.build builder)))


(defn cfn-anomaly-detector-metric-stat-property-builder
  "The cfn-anomaly-detector-metric-stat-property-builder function buildes out new instances of 
CfnAnomalyDetector$MetricStatProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metric` | software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector$MetricProperty | [[cdk.support/lookup-entry]] | `:metric` |
| `period` | java.lang.Number | [[cdk.support/lookup-entry]] | `:period` |
| `stat` | java.lang.String | [[cdk.support/lookup-entry]] | `:stat` |
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |"
  [stack id config]
  (let [builder (CfnAnomalyDetector$MetricStatProperty$Builder.)]
    (when-let [data (lookup-entry config id :metric)]
      (. builder metric data))
    (when-let [data (lookup-entry config id :period)]
      (. builder period data))
    (when-let [data (lookup-entry config id :stat)]
      (. builder stat data))
    (when-let [data (lookup-entry config id :unit)]
      (. builder unit data))
    (.build builder)))


(defn cfn-anomaly-detector-props-builder
  "The cfn-anomaly-detector-props-builder function buildes out new instances of 
CfnAnomalyDetectorProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuration` | software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector$ConfigurationProperty | [[cdk.support/lookup-entry]] | `:configuration` |
| `dimensions` | java.util.List | [[cdk.support/lookup-entry]] | `:dimensions` |
| `metricCharacteristics` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:metric-characteristics` |
| `metricMathAnomalyDetector` | software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector$MetricMathAnomalyDetectorProperty | [[cdk.support/lookup-entry]] | `:metric-math-anomaly-detector` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `singleMetricAnomalyDetector` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:single-metric-anomaly-detector` |
| `stat` | java.lang.String | [[cdk.support/lookup-entry]] | `:stat` |"
  [stack id config]
  (let [builder (CfnAnomalyDetectorProps$Builder.)]
    (when-let [data (lookup-entry config id :configuration)]
      (. builder configuration data))
    (when-let [data (lookup-entry config id :dimensions)]
      (. builder dimensions data))
    (when-let [data (lookup-entry config id :metric-characteristics)]
      (. builder metricCharacteristics data))
    (when-let [data (lookup-entry config id :metric-math-anomaly-detector)]
      (. builder metricMathAnomalyDetector data))
    (when-let [data (lookup-entry config id :metric-name)]
      (. builder metricName data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (when-let [data (lookup-entry config id :single-metric-anomaly-detector)]
      (. builder singleMetricAnomalyDetector data))
    (when-let [data (lookup-entry config id :stat)]
      (. builder stat data))
    (.build builder)))


(defn cfn-anomaly-detector-range-property-builder
  "The cfn-anomaly-detector-range-property-builder function buildes out new instances of 
CfnAnomalyDetector$RangeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:end-time` |
| `startTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-time` |"
  [stack id config]
  (let [builder (CfnAnomalyDetector$RangeProperty$Builder.)]
    (when-let [data (lookup-entry config id :end-time)]
      (. builder endTime data))
    (when-let [data (lookup-entry config id :start-time)]
      (. builder startTime data))
    (.build builder)))


(defn cfn-anomaly-detector-single-metric-anomaly-detector-property-builder
  "The cfn-anomaly-detector-single-metric-anomaly-detector-property-builder function buildes out new instances of 
CfnAnomalyDetector$SingleMetricAnomalyDetectorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `dimensions` | java.util.List | [[cdk.support/lookup-entry]] | `:dimensions` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `stat` | java.lang.String | [[cdk.support/lookup-entry]] | `:stat` |"
  [stack id config]
  (let [builder (CfnAnomalyDetector$SingleMetricAnomalyDetectorProperty$Builder.)]
    (when-let [data (lookup-entry config id :account-id)]
      (. builder accountId data))
    (when-let [data (lookup-entry config id :dimensions)]
      (. builder dimensions data))
    (when-let [data (lookup-entry config id :metric-name)]
      (. builder metricName data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (when-let [data (lookup-entry config id :stat)]
      (. builder stat data))
    (.build builder)))


(defn cfn-composite-alarm-builder
  "The cfn-composite-alarm-builder function buildes out new instances of 
CfnCompositeAlarm$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCompositeAlarm$Builder/create stack id)]
    (when-let [data (lookup-entry config id :actions-enabled)]
      (. builder actionsEnabled data))
    (when-let [data (lookup-entry config id :actions-suppressor)]
      (. builder actionsSuppressor data))
    (when-let [data (lookup-entry config id :actions-suppressor-extension-period)]
      (. builder actionsSuppressorExtensionPeriod data))
    (when-let [data (lookup-entry config id :actions-suppressor-wait-period)]
      (. builder actionsSuppressorWaitPeriod data))
    (when-let [data (lookup-entry config id :alarm-actions)]
      (. builder alarmActions data))
    (when-let [data (lookup-entry config id :alarm-description)]
      (. builder alarmDescription data))
    (when-let [data (lookup-entry config id :alarm-name)]
      (. builder alarmName data))
    (when-let [data (lookup-entry config id :alarm-rule)]
      (. builder alarmRule data))
    (when-let [data (lookup-entry config id :insufficient-data-actions)]
      (. builder insufficientDataActions data))
    (when-let [data (lookup-entry config id :ok-actions)]
      (. builder okActions data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-composite-alarm-props-builder
  "The cfn-composite-alarm-props-builder function buildes out new instances of 
CfnCompositeAlarmProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCompositeAlarmProps$Builder.)]
    (when-let [data (lookup-entry config id :actions-enabled)]
      (. builder actionsEnabled data))
    (when-let [data (lookup-entry config id :actions-suppressor)]
      (. builder actionsSuppressor data))
    (when-let [data (lookup-entry config id :actions-suppressor-extension-period)]
      (. builder actionsSuppressorExtensionPeriod data))
    (when-let [data (lookup-entry config id :actions-suppressor-wait-period)]
      (. builder actionsSuppressorWaitPeriod data))
    (when-let [data (lookup-entry config id :alarm-actions)]
      (. builder alarmActions data))
    (when-let [data (lookup-entry config id :alarm-description)]
      (. builder alarmDescription data))
    (when-let [data (lookup-entry config id :alarm-name)]
      (. builder alarmName data))
    (when-let [data (lookup-entry config id :alarm-rule)]
      (. builder alarmRule data))
    (when-let [data (lookup-entry config id :insufficient-data-actions)]
      (. builder insufficientDataActions data))
    (when-let [data (lookup-entry config id :ok-actions)]
      (. builder okActions data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-dashboard-builder
  "The cfn-dashboard-builder function buildes out new instances of 
CfnDashboard$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dashboardBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:dashboard-body` |
| `dashboardName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dashboard-name` |"
  [stack id config]
  (let [builder (CfnDashboard$Builder/create stack id)]
    (when-let [data (lookup-entry config id :dashboard-body)]
      (. builder dashboardBody data))
    (when-let [data (lookup-entry config id :dashboard-name)]
      (. builder dashboardName data))
    (.build builder)))


(defn cfn-dashboard-props-builder
  "The cfn-dashboard-props-builder function buildes out new instances of 
CfnDashboardProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dashboardBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:dashboard-body` |
| `dashboardName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dashboard-name` |"
  [stack id config]
  (let [builder (CfnDashboardProps$Builder.)]
    (when-let [data (lookup-entry config id :dashboard-body)]
      (. builder dashboardBody data))
    (when-let [data (lookup-entry config id :dashboard-name)]
      (. builder dashboardName data))
    (.build builder)))


(defn cfn-insight-rule-builder
  "The cfn-insight-rule-builder function buildes out new instances of 
CfnInsightRule$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ruleBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-body` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
| `ruleState` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-state` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnInsightRule$Builder/create stack id)]
    (when-let [data (lookup-entry config id :rule-body)]
      (. builder ruleBody data))
    (when-let [data (lookup-entry config id :rule-name)]
      (. builder ruleName data))
    (when-let [data (lookup-entry config id :rule-state)]
      (. builder ruleState data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-insight-rule-props-builder
  "The cfn-insight-rule-props-builder function buildes out new instances of 
CfnInsightRuleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ruleBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-body` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
| `ruleState` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-state` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnInsightRuleProps$Builder.)]
    (when-let [data (lookup-entry config id :rule-body)]
      (. builder ruleBody data))
    (when-let [data (lookup-entry config id :rule-name)]
      (. builder ruleName data))
    (when-let [data (lookup-entry config id :rule-state)]
      (. builder ruleState data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-metric-stream-builder
  "The cfn-metric-stream-builder function buildes out new instances of 
CfnMetricStream$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnMetricStream$Builder/create stack id)]
    (when-let [data (lookup-entry config id :exclude-filters)]
      (. builder excludeFilters data))
    (when-let [data (lookup-entry config id :firehose-arn)]
      (. builder firehoseArn data))
    (when-let [data (lookup-entry config id :include-filters)]
      (. builder includeFilters data))
    (when-let [data (lookup-entry config id :include-linked-accounts-metrics)]
      (. builder includeLinkedAccountsMetrics data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :output-format)]
      (. builder outputFormat data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :statistics-configurations)]
      (. builder statisticsConfigurations data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-metric-stream-metric-stream-filter-property-builder
  "The cfn-metric-stream-metric-stream-filter-property-builder function buildes out new instances of 
CfnMetricStream$MetricStreamFilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metricNames` | java.util.List | [[cdk.support/lookup-entry]] | `:metric-names` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |"
  [stack id config]
  (let [builder (CfnMetricStream$MetricStreamFilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :metric-names)]
      (. builder metricNames data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (.build builder)))


(defn cfn-metric-stream-metric-stream-statistics-configuration-property-builder
  "The cfn-metric-stream-metric-stream-statistics-configuration-property-builder function buildes out new instances of 
CfnMetricStream$MetricStreamStatisticsConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalStatistics` | java.util.List | [[cdk.support/lookup-entry]] | `:additional-statistics` |
| `includeMetrics` | java.util.List | [[cdk.support/lookup-entry]] | `:include-metrics` |"
  [stack id config]
  (let [builder (CfnMetricStream$MetricStreamStatisticsConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :additional-statistics)]
      (. builder additionalStatistics data))
    (when-let [data (lookup-entry config id :include-metrics)]
      (. builder includeMetrics data))
    (.build builder)))


(defn cfn-metric-stream-metric-stream-statistics-metric-property-builder
  "The cfn-metric-stream-metric-stream-statistics-metric-property-builder function buildes out new instances of 
CfnMetricStream$MetricStreamStatisticsMetricProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |"
  [stack id config]
  (let [builder (CfnMetricStream$MetricStreamStatisticsMetricProperty$Builder.)]
    (when-let [data (lookup-entry config id :metric-name)]
      (. builder metricName data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (.build builder)))


(defn cfn-metric-stream-props-builder
  "The cfn-metric-stream-props-builder function buildes out new instances of 
CfnMetricStreamProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnMetricStreamProps$Builder.)]
    (when-let [data (lookup-entry config id :exclude-filters)]
      (. builder excludeFilters data))
    (when-let [data (lookup-entry config id :firehose-arn)]
      (. builder firehoseArn data))
    (when-let [data (lookup-entry config id :include-filters)]
      (. builder includeFilters data))
    (when-let [data (lookup-entry config id :include-linked-accounts-metrics)]
      (. builder includeLinkedAccountsMetrics data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :output-format)]
      (. builder outputFormat data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :statistics-configurations)]
      (. builder statisticsConfigurations data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn common-metric-options-builder
  "The common-metric-options-builder function buildes out new instances of 
CommonMetricOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `color` | java.lang.String | [[cdk.support/lookup-entry]] | `:color` |
| `dimensionsMap` | java.util.Map | [[cdk.support/lookup-entry]] | `:dimensions-map` |
| `label` | java.lang.String | [[cdk.support/lookup-entry]] | `:label` |
| `period` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:period` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `statistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:statistic` |
| `unit` | software.amazon.awscdk.services.cloudwatch.Unit | [[cdk.api.services.cloudwatch/unit]] | `:unit` |"
  [stack id config]
  (let [builder (CommonMetricOptions$Builder.)]
    (when-let [data (lookup-entry config id :account)]
      (. builder account data))
    (when-let [data (lookup-entry config id :color)]
      (. builder color data))
    (when-let [data (lookup-entry config id :dimensions-map)]
      (. builder dimensionsMap data))
    (when-let [data (lookup-entry config id :label)]
      (. builder label data))
    (when-let [data (lookup-entry config id :period)]
      (. builder period data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :statistic)]
      (. builder statistic data))
    (when-let [data (unit config id :unit)]
      (. builder unit data))
    (.build builder)))


(defn composite-alarm-builder
  "The composite-alarm-builder function buildes out new instances of 
CompositeAlarm$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:actions-enabled` |
| `actionsSuppressor` | software.amazon.awscdk.services.cloudwatch.IAlarm | [[cdk.support/lookup-entry]] | `:actions-suppressor` |
| `actionsSuppressorExtensionPeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:actions-suppressor-extension-period` |
| `actionsSuppressorWaitPeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:actions-suppressor-wait-period` |
| `alarmDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-description` |
| `alarmRule` | software.amazon.awscdk.services.cloudwatch.IAlarmRule | [[cdk.support/lookup-entry]] | `:alarm-rule` |
| `compositeAlarmName` | java.lang.String | [[cdk.support/lookup-entry]] | `:composite-alarm-name` |"
  [stack id config]
  (let [builder (CompositeAlarm$Builder/create stack id)]
    (when-let [data (lookup-entry config id :actions-enabled)]
      (. builder actionsEnabled data))
    (when-let [data (lookup-entry config id :actions-suppressor)]
      (. builder actionsSuppressor data))
    (when-let [data (lookup-entry config id :actions-suppressor-extension-period)]
      (. builder actionsSuppressorExtensionPeriod data))
    (when-let [data (lookup-entry config id :actions-suppressor-wait-period)]
      (. builder actionsSuppressorWaitPeriod data))
    (when-let [data (lookup-entry config id :alarm-description)]
      (. builder alarmDescription data))
    (when-let [data (lookup-entry config id :alarm-rule)]
      (. builder alarmRule data))
    (when-let [data (lookup-entry config id :composite-alarm-name)]
      (. builder compositeAlarmName data))
    (.build builder)))


(defn composite-alarm-props-builder
  "The composite-alarm-props-builder function buildes out new instances of 
CompositeAlarmProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:actions-enabled` |
| `actionsSuppressor` | software.amazon.awscdk.services.cloudwatch.IAlarm | [[cdk.support/lookup-entry]] | `:actions-suppressor` |
| `actionsSuppressorExtensionPeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:actions-suppressor-extension-period` |
| `actionsSuppressorWaitPeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:actions-suppressor-wait-period` |
| `alarmDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-description` |
| `alarmRule` | software.amazon.awscdk.services.cloudwatch.IAlarmRule | [[cdk.support/lookup-entry]] | `:alarm-rule` |
| `compositeAlarmName` | java.lang.String | [[cdk.support/lookup-entry]] | `:composite-alarm-name` |"
  [stack id config]
  (let [builder (CompositeAlarmProps$Builder.)]
    (when-let [data (lookup-entry config id :actions-enabled)]
      (. builder actionsEnabled data))
    (when-let [data (lookup-entry config id :actions-suppressor)]
      (. builder actionsSuppressor data))
    (when-let [data (lookup-entry config id :actions-suppressor-extension-period)]
      (. builder actionsSuppressorExtensionPeriod data))
    (when-let [data (lookup-entry config id :actions-suppressor-wait-period)]
      (. builder actionsSuppressorWaitPeriod data))
    (when-let [data (lookup-entry config id :alarm-description)]
      (. builder alarmDescription data))
    (when-let [data (lookup-entry config id :alarm-rule)]
      (. builder alarmRule data))
    (when-let [data (lookup-entry config id :composite-alarm-name)]
      (. builder compositeAlarmName data))
    (.build builder)))


(defn create-alarm-options-builder
  "The create-alarm-options-builder function buildes out new instances of 
CreateAlarmOptions$Builder using the provided configuration.  Each field is set as follows:

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
| `treatMissingData` | software.amazon.awscdk.services.cloudwatch.TreatMissingData | [[cdk.api.services.cloudwatch/treat-missing-data]] | `:treat-missing-data` |"
  [stack id config]
  (let [builder (CreateAlarmOptions$Builder.)]
    (when-let [data (lookup-entry config id :actions-enabled)]
      (. builder actionsEnabled data))
    (when-let [data (lookup-entry config id :alarm-description)]
      (. builder alarmDescription data))
    (when-let [data (lookup-entry config id :alarm-name)]
      (. builder alarmName data))
    (when-let [data (comparison-operator config id :comparison-operator)]
      (. builder comparisonOperator data))
    (when-let [data (lookup-entry config id :datapoints-to-alarm)]
      (. builder datapointsToAlarm data))
    (when-let [data (lookup-entry config id :evaluate-low-sample-count-percentile)]
      (. builder evaluateLowSampleCountPercentile data))
    (when-let [data (lookup-entry config id :evaluation-periods)]
      (. builder evaluationPeriods data))
    (when-let [data (lookup-entry config id :threshold)]
      (. builder threshold data))
    (when-let [data (treat-missing-data config id :treat-missing-data)]
      (. builder treatMissingData data))
    (.build builder)))


(defn custom-widget-builder
  "The custom-widget-builder function buildes out new instances of 
CustomWidget$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-arn` |
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `params` | java.lang.Object | [[cdk.support/lookup-entry]] | `:params` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `updateOnRefresh` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:update-on-refresh` |
| `updateOnResize` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:update-on-resize` |
| `updateOnTimeRangeChange` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:update-on-time-range-change` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |"
  [stack id config]
  (let [builder (CustomWidget$Builder/create)]
    (when-let [data (lookup-entry config id :function-arn)]
      (. builder functionArn data))
    (when-let [data (lookup-entry config id :height)]
      (. builder height data))
    (when-let [data (lookup-entry config id :params)]
      (. builder params data))
    (when-let [data (lookup-entry config id :title)]
      (. builder title data))
    (when-let [data (lookup-entry config id :update-on-refresh)]
      (. builder updateOnRefresh data))
    (when-let [data (lookup-entry config id :update-on-resize)]
      (. builder updateOnResize data))
    (when-let [data (lookup-entry config id :update-on-time-range-change)]
      (. builder updateOnTimeRangeChange data))
    (when-let [data (lookup-entry config id :width)]
      (. builder width data))
    (.build builder)))


(defn custom-widget-props-builder
  "The custom-widget-props-builder function buildes out new instances of 
CustomWidgetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-arn` |
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `params` | java.lang.Object | [[cdk.support/lookup-entry]] | `:params` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `updateOnRefresh` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:update-on-refresh` |
| `updateOnResize` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:update-on-resize` |
| `updateOnTimeRangeChange` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:update-on-time-range-change` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |"
  [stack id config]
  (let [builder (CustomWidgetProps$Builder.)]
    (when-let [data (lookup-entry config id :function-arn)]
      (. builder functionArn data))
    (when-let [data (lookup-entry config id :height)]
      (. builder height data))
    (when-let [data (lookup-entry config id :params)]
      (. builder params data))
    (when-let [data (lookup-entry config id :title)]
      (. builder title data))
    (when-let [data (lookup-entry config id :update-on-refresh)]
      (. builder updateOnRefresh data))
    (when-let [data (lookup-entry config id :update-on-resize)]
      (. builder updateOnResize data))
    (when-let [data (lookup-entry config id :update-on-time-range-change)]
      (. builder updateOnTimeRangeChange data))
    (when-let [data (lookup-entry config id :width)]
      (. builder width data))
    (.build builder)))


(defn dashboard-builder
  "The dashboard-builder function buildes out new instances of 
Dashboard$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dashboardName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dashboard-name` |
| `defaultInterval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:default-interval` |
| `end` | java.lang.String | [[cdk.support/lookup-entry]] | `:end` |
| `periodOverride` | software.amazon.awscdk.services.cloudwatch.PeriodOverride | [[cdk.api.services.cloudwatch/period-override]] | `:period-override` |
| `start` | java.lang.String | [[cdk.support/lookup-entry]] | `:start` |
| `variables` | java.util.List | [[cdk.support/lookup-entry]] | `:variables` |
| `widgets` | java.util.List | [[cdk.support/lookup-entry]] | `:widgets` |"
  [stack id config]
  (let [builder (Dashboard$Builder/create stack id)]
    (when-let [data (lookup-entry config id :dashboard-name)]
      (. builder dashboardName data))
    (when-let [data (lookup-entry config id :default-interval)]
      (. builder defaultInterval data))
    (when-let [data (lookup-entry config id :end)]
      (. builder end data))
    (when-let [data (period-override config id :period-override)]
      (. builder periodOverride data))
    (when-let [data (lookup-entry config id :start)]
      (. builder start data))
    (when-let [data (lookup-entry config id :variables)]
      (. builder variables data))
    (when-let [data (lookup-entry config id :widgets)]
      (. builder widgets data))
    (.build builder)))


(defn dashboard-props-builder
  "The dashboard-props-builder function buildes out new instances of 
DashboardProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dashboardName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dashboard-name` |
| `defaultInterval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:default-interval` |
| `end` | java.lang.String | [[cdk.support/lookup-entry]] | `:end` |
| `periodOverride` | software.amazon.awscdk.services.cloudwatch.PeriodOverride | [[cdk.api.services.cloudwatch/period-override]] | `:period-override` |
| `start` | java.lang.String | [[cdk.support/lookup-entry]] | `:start` |
| `variables` | java.util.List | [[cdk.support/lookup-entry]] | `:variables` |
| `widgets` | java.util.List | [[cdk.support/lookup-entry]] | `:widgets` |"
  [stack id config]
  (let [builder (DashboardProps$Builder.)]
    (when-let [data (lookup-entry config id :dashboard-name)]
      (. builder dashboardName data))
    (when-let [data (lookup-entry config id :default-interval)]
      (. builder defaultInterval data))
    (when-let [data (lookup-entry config id :end)]
      (. builder end data))
    (when-let [data (period-override config id :period-override)]
      (. builder periodOverride data))
    (when-let [data (lookup-entry config id :start)]
      (. builder start data))
    (when-let [data (lookup-entry config id :variables)]
      (. builder variables data))
    (when-let [data (lookup-entry config id :widgets)]
      (. builder widgets data))
    (.build builder)))


(defn dashboard-variable-builder
  "The dashboard-variable-builder function buildes out new instances of 
DashboardVariable$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultValue` | software.amazon.awscdk.services.cloudwatch.DefaultValue | [[cdk.support/lookup-entry]] | `:default-value` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `inputType` | software.amazon.awscdk.services.cloudwatch.VariableInputType | [[cdk.api.services.cloudwatch/variable-input-type]] | `:input-type` |
| `label` | java.lang.String | [[cdk.support/lookup-entry]] | `:label` |
| `type` | software.amazon.awscdk.services.cloudwatch.VariableType | [[cdk.api.services.cloudwatch/variable-type]] | `:type` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
| `values` | software.amazon.awscdk.services.cloudwatch.Values | [[cdk.support/lookup-entry]] | `:values` |
| `visible` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:visible` |"
  [stack id config]
  (let [builder (DashboardVariable$Builder/create)]
    (when-let [data (lookup-entry config id :default-value)]
      (. builder defaultValue data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (variable-input-type config id :input-type)]
      (. builder inputType data))
    (when-let [data (lookup-entry config id :label)]
      (. builder label data))
    (when-let [data (variable-type config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (when-let [data (lookup-entry config id :values)]
      (. builder values data))
    (when-let [data (lookup-entry config id :visible)]
      (. builder visible data))
    (.build builder)))


(defn dashboard-variable-options-builder
  "The dashboard-variable-options-builder function buildes out new instances of 
DashboardVariableOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultValue` | software.amazon.awscdk.services.cloudwatch.DefaultValue | [[cdk.support/lookup-entry]] | `:default-value` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `inputType` | software.amazon.awscdk.services.cloudwatch.VariableInputType | [[cdk.api.services.cloudwatch/variable-input-type]] | `:input-type` |
| `label` | java.lang.String | [[cdk.support/lookup-entry]] | `:label` |
| `type` | software.amazon.awscdk.services.cloudwatch.VariableType | [[cdk.api.services.cloudwatch/variable-type]] | `:type` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
| `values` | software.amazon.awscdk.services.cloudwatch.Values | [[cdk.support/lookup-entry]] | `:values` |
| `visible` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:visible` |"
  [stack id config]
  (let [builder (DashboardVariableOptions$Builder.)]
    (when-let [data (lookup-entry config id :default-value)]
      (. builder defaultValue data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (variable-input-type config id :input-type)]
      (. builder inputType data))
    (when-let [data (lookup-entry config id :label)]
      (. builder label data))
    (when-let [data (variable-type config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (when-let [data (lookup-entry config id :values)]
      (. builder values data))
    (when-let [data (lookup-entry config id :visible)]
      (. builder visible data))
    (.build builder)))


(defn dimension-builder
  "The dimension-builder function buildes out new instances of 
Dimension$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.Object | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (Dimension$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn gauge-widget-builder
  "The gauge-widget-builder function buildes out new instances of 
GaugeWidget$Builder using the provided configuration.  Each field is set as follows:

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
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |"
  [stack id config]
  (let [builder (GaugeWidget$Builder/create)]
    (when-let [data (lookup-entry config id :annotations)]
      (. builder annotations data))
    (when-let [data (lookup-entry config id :end)]
      (. builder end data))
    (when-let [data (lookup-entry config id :height)]
      (. builder height data))
    (when-let [data (lookup-entry config id :left-y-axis)]
      (. builder leftYAxis data))
    (when-let [data (legend-position config id :legend-position)]
      (. builder legendPosition data))
    (when-let [data (lookup-entry config id :live-data)]
      (. builder liveData data))
    (when-let [data (lookup-entry config id :metrics)]
      (. builder metrics data))
    (when-let [data (lookup-entry config id :period)]
      (. builder period data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :set-period-to-time-range)]
      (. builder setPeriodToTimeRange data))
    (when-let [data (lookup-entry config id :start)]
      (. builder start data))
    (when-let [data (lookup-entry config id :statistic)]
      (. builder statistic data))
    (when-let [data (lookup-entry config id :title)]
      (. builder title data))
    (when-let [data (lookup-entry config id :width)]
      (. builder width data))
    (.build builder)))


(defn gauge-widget-props-builder
  "The gauge-widget-props-builder function buildes out new instances of 
GaugeWidgetProps$Builder using the provided configuration.  Each field is set as follows:

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
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |"
  [stack id config]
  (let [builder (GaugeWidgetProps$Builder.)]
    (when-let [data (lookup-entry config id :annotations)]
      (. builder annotations data))
    (when-let [data (lookup-entry config id :end)]
      (. builder end data))
    (when-let [data (lookup-entry config id :height)]
      (. builder height data))
    (when-let [data (lookup-entry config id :left-y-axis)]
      (. builder leftYAxis data))
    (when-let [data (legend-position config id :legend-position)]
      (. builder legendPosition data))
    (when-let [data (lookup-entry config id :live-data)]
      (. builder liveData data))
    (when-let [data (lookup-entry config id :metrics)]
      (. builder metrics data))
    (when-let [data (lookup-entry config id :period)]
      (. builder period data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :set-period-to-time-range)]
      (. builder setPeriodToTimeRange data))
    (when-let [data (lookup-entry config id :start)]
      (. builder start data))
    (when-let [data (lookup-entry config id :statistic)]
      (. builder statistic data))
    (when-let [data (lookup-entry config id :title)]
      (. builder title data))
    (when-let [data (lookup-entry config id :width)]
      (. builder width data))
    (.build builder)))


(defn graph-widget-builder
  "The graph-widget-builder function buildes out new instances of 
GraphWidget$Builder using the provided configuration.  Each field is set as follows:

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
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |"
  [stack id config]
  (let [builder (GraphWidget$Builder/create)]
    (when-let [data (lookup-entry config id :end)]
      (. builder end data))
    (when-let [data (lookup-entry config id :height)]
      (. builder height data))
    (when-let [data (lookup-entry config id :left)]
      (. builder left data))
    (when-let [data (lookup-entry config id :left-annotations)]
      (. builder leftAnnotations data))
    (when-let [data (lookup-entry config id :left-y-axis)]
      (. builder leftYAxis data))
    (when-let [data (legend-position config id :legend-position)]
      (. builder legendPosition data))
    (when-let [data (lookup-entry config id :live-data)]
      (. builder liveData data))
    (when-let [data (lookup-entry config id :period)]
      (. builder period data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :right)]
      (. builder right data))
    (when-let [data (lookup-entry config id :right-annotations)]
      (. builder rightAnnotations data))
    (when-let [data (lookup-entry config id :right-y-axis)]
      (. builder rightYAxis data))
    (when-let [data (lookup-entry config id :set-period-to-time-range)]
      (. builder setPeriodToTimeRange data))
    (when-let [data (lookup-entry config id :stacked)]
      (. builder stacked data))
    (when-let [data (lookup-entry config id :start)]
      (. builder start data))
    (when-let [data (lookup-entry config id :statistic)]
      (. builder statistic data))
    (when-let [data (lookup-entry config id :title)]
      (. builder title data))
    (when-let [data (lookup-entry config id :vertical-annotations)]
      (. builder verticalAnnotations data))
    (when-let [data (graph-widget-view config id :view)]
      (. builder view data))
    (when-let [data (lookup-entry config id :width)]
      (. builder width data))
    (.build builder)))


(defn graph-widget-props-builder
  "The graph-widget-props-builder function buildes out new instances of 
GraphWidgetProps$Builder using the provided configuration.  Each field is set as follows:

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
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |"
  [stack id config]
  (let [builder (GraphWidgetProps$Builder.)]
    (when-let [data (lookup-entry config id :end)]
      (. builder end data))
    (when-let [data (lookup-entry config id :height)]
      (. builder height data))
    (when-let [data (lookup-entry config id :left)]
      (. builder left data))
    (when-let [data (lookup-entry config id :left-annotations)]
      (. builder leftAnnotations data))
    (when-let [data (lookup-entry config id :left-y-axis)]
      (. builder leftYAxis data))
    (when-let [data (legend-position config id :legend-position)]
      (. builder legendPosition data))
    (when-let [data (lookup-entry config id :live-data)]
      (. builder liveData data))
    (when-let [data (lookup-entry config id :period)]
      (. builder period data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :right)]
      (. builder right data))
    (when-let [data (lookup-entry config id :right-annotations)]
      (. builder rightAnnotations data))
    (when-let [data (lookup-entry config id :right-y-axis)]
      (. builder rightYAxis data))
    (when-let [data (lookup-entry config id :set-period-to-time-range)]
      (. builder setPeriodToTimeRange data))
    (when-let [data (lookup-entry config id :stacked)]
      (. builder stacked data))
    (when-let [data (lookup-entry config id :start)]
      (. builder start data))
    (when-let [data (lookup-entry config id :statistic)]
      (. builder statistic data))
    (when-let [data (lookup-entry config id :title)]
      (. builder title data))
    (when-let [data (lookup-entry config id :vertical-annotations)]
      (. builder verticalAnnotations data))
    (when-let [data (graph-widget-view config id :view)]
      (. builder view data))
    (when-let [data (lookup-entry config id :width)]
      (. builder width data))
    (.build builder)))


(defn horizontal-annotation-builder
  "The horizontal-annotation-builder function buildes out new instances of 
HorizontalAnnotation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `color` | java.lang.String | [[cdk.support/lookup-entry]] | `:color` |
| `fill` | software.amazon.awscdk.services.cloudwatch.Shading | [[cdk.api.services.cloudwatch/shading]] | `:fill` |
| `label` | java.lang.String | [[cdk.support/lookup-entry]] | `:label` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |
| `visible` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:visible` |"
  [stack id config]
  (let [builder (HorizontalAnnotation$Builder.)]
    (when-let [data (lookup-entry config id :color)]
      (. builder color data))
    (when-let [data (shading config id :fill)]
      (. builder fill data))
    (when-let [data (lookup-entry config id :label)]
      (. builder label data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (when-let [data (lookup-entry config id :visible)]
      (. builder visible data))
    (.build builder)))


(defn log-query-widget-builder
  "The log-query-widget-builder function buildes out new instances of 
LogQueryWidget$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `logGroupNames` | java.util.List | [[cdk.support/lookup-entry]] | `:log-group-names` |
| `queryLines` | java.util.List | [[cdk.support/lookup-entry]] | `:query-lines` |
| `queryString` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-string` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `view` | software.amazon.awscdk.services.cloudwatch.LogQueryVisualizationType | [[cdk.api.services.cloudwatch/log-query-visualization-type]] | `:view` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |"
  [stack id config]
  (let [builder (LogQueryWidget$Builder/create)]
    (when-let [data (lookup-entry config id :height)]
      (. builder height data))
    (when-let [data (lookup-entry config id :log-group-names)]
      (. builder logGroupNames data))
    (when-let [data (lookup-entry config id :query-lines)]
      (. builder queryLines data))
    (when-let [data (lookup-entry config id :query-string)]
      (. builder queryString data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :title)]
      (. builder title data))
    (when-let [data (log-query-visualization-type config id :view)]
      (. builder view data))
    (when-let [data (lookup-entry config id :width)]
      (. builder width data))
    (.build builder)))


(defn log-query-widget-props-builder
  "The log-query-widget-props-builder function buildes out new instances of 
LogQueryWidgetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `logGroupNames` | java.util.List | [[cdk.support/lookup-entry]] | `:log-group-names` |
| `queryLines` | java.util.List | [[cdk.support/lookup-entry]] | `:query-lines` |
| `queryString` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-string` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `view` | software.amazon.awscdk.services.cloudwatch.LogQueryVisualizationType | [[cdk.api.services.cloudwatch/log-query-visualization-type]] | `:view` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |"
  [stack id config]
  (let [builder (LogQueryWidgetProps$Builder.)]
    (when-let [data (lookup-entry config id :height)]
      (. builder height data))
    (when-let [data (lookup-entry config id :log-group-names)]
      (. builder logGroupNames data))
    (when-let [data (lookup-entry config id :query-lines)]
      (. builder queryLines data))
    (when-let [data (lookup-entry config id :query-string)]
      (. builder queryString data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :title)]
      (. builder title data))
    (when-let [data (log-query-visualization-type config id :view)]
      (. builder view data))
    (when-let [data (lookup-entry config id :width)]
      (. builder width data))
    (.build builder)))


(defn math-expression-builder
  "The math-expression-builder function buildes out new instances of 
MathExpression$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `color` | java.lang.String | [[cdk.support/lookup-entry]] | `:color` |
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `label` | java.lang.String | [[cdk.support/lookup-entry]] | `:label` |
| `period` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:period` |
| `searchAccount` | java.lang.String | [[cdk.support/lookup-entry]] | `:search-account` |
| `searchRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:search-region` |
| `usingMetrics` | java.util.Map | [[cdk.support/lookup-entry]] | `:using-metrics` |"
  [stack id config]
  (let [builder (MathExpression$Builder/create)]
    (when-let [data (lookup-entry config id :color)]
      (. builder color data))
    (when-let [data (lookup-entry config id :expression)]
      (. builder expression data))
    (when-let [data (lookup-entry config id :label)]
      (. builder label data))
    (when-let [data (lookup-entry config id :period)]
      (. builder period data))
    (when-let [data (lookup-entry config id :search-account)]
      (. builder searchAccount data))
    (when-let [data (lookup-entry config id :search-region)]
      (. builder searchRegion data))
    (when-let [data (lookup-entry config id :using-metrics)]
      (. builder usingMetrics data))
    (.build builder)))


(defn math-expression-options-builder
  "The math-expression-options-builder function buildes out new instances of 
MathExpressionOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `color` | java.lang.String | [[cdk.support/lookup-entry]] | `:color` |
| `label` | java.lang.String | [[cdk.support/lookup-entry]] | `:label` |
| `period` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:period` |
| `searchAccount` | java.lang.String | [[cdk.support/lookup-entry]] | `:search-account` |
| `searchRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:search-region` |"
  [stack id config]
  (let [builder (MathExpressionOptions$Builder.)]
    (when-let [data (lookup-entry config id :color)]
      (. builder color data))
    (when-let [data (lookup-entry config id :label)]
      (. builder label data))
    (when-let [data (lookup-entry config id :period)]
      (. builder period data))
    (when-let [data (lookup-entry config id :search-account)]
      (. builder searchAccount data))
    (when-let [data (lookup-entry config id :search-region)]
      (. builder searchRegion data))
    (.build builder)))


(defn math-expression-props-builder
  "The math-expression-props-builder function buildes out new instances of 
MathExpressionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `color` | java.lang.String | [[cdk.support/lookup-entry]] | `:color` |
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `label` | java.lang.String | [[cdk.support/lookup-entry]] | `:label` |
| `period` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:period` |
| `searchAccount` | java.lang.String | [[cdk.support/lookup-entry]] | `:search-account` |
| `searchRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:search-region` |
| `usingMetrics` | java.util.Map | [[cdk.support/lookup-entry]] | `:using-metrics` |"
  [stack id config]
  (let [builder (MathExpressionProps$Builder.)]
    (when-let [data (lookup-entry config id :color)]
      (. builder color data))
    (when-let [data (lookup-entry config id :expression)]
      (. builder expression data))
    (when-let [data (lookup-entry config id :label)]
      (. builder label data))
    (when-let [data (lookup-entry config id :period)]
      (. builder period data))
    (when-let [data (lookup-entry config id :search-account)]
      (. builder searchAccount data))
    (when-let [data (lookup-entry config id :search-region)]
      (. builder searchRegion data))
    (when-let [data (lookup-entry config id :using-metrics)]
      (. builder usingMetrics data))
    (.build builder)))


(defn metric-builder
  "The metric-builder function buildes out new instances of 
Metric$Builder using the provided configuration.  Each field is set as follows:

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
| `unit` | software.amazon.awscdk.services.cloudwatch.Unit | [[cdk.api.services.cloudwatch/unit]] | `:unit` |"
  [stack id config]
  (let [builder (Metric$Builder/create)]
    (when-let [data (lookup-entry config id :account)]
      (. builder account data))
    (when-let [data (lookup-entry config id :color)]
      (. builder color data))
    (when-let [data (lookup-entry config id :dimensions-map)]
      (. builder dimensionsMap data))
    (when-let [data (lookup-entry config id :label)]
      (. builder label data))
    (when-let [data (lookup-entry config id :metric-name)]
      (. builder metricName data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (when-let [data (lookup-entry config id :period)]
      (. builder period data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :statistic)]
      (. builder statistic data))
    (when-let [data (unit config id :unit)]
      (. builder unit data))
    (.build builder)))


(defn metric-config-builder
  "The metric-config-builder function buildes out new instances of 
MetricConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mathExpression` | software.amazon.awscdk.services.cloudwatch.MetricExpressionConfig | [[cdk.support/lookup-entry]] | `:math-expression` |
| `metricStat` | software.amazon.awscdk.services.cloudwatch.MetricStatConfig | [[cdk.support/lookup-entry]] | `:metric-stat` |
| `renderingProperties` | java.util.Map | [[cdk.support/lookup-entry]] | `:rendering-properties` |"
  [stack id config]
  (let [builder (MetricConfig$Builder.)]
    (when-let [data (lookup-entry config id :math-expression)]
      (. builder mathExpression data))
    (when-let [data (lookup-entry config id :metric-stat)]
      (. builder metricStat data))
    (when-let [data (lookup-entry config id :rendering-properties)]
      (. builder renderingProperties data))
    (.build builder)))


(defn metric-expression-config-builder
  "The metric-expression-config-builder function buildes out new instances of 
MetricExpressionConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `period` | java.lang.Number | [[cdk.support/lookup-entry]] | `:period` |
| `searchAccount` | java.lang.String | [[cdk.support/lookup-entry]] | `:search-account` |
| `searchRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:search-region` |
| `usingMetrics` | java.util.Map | [[cdk.support/lookup-entry]] | `:using-metrics` |"
  [stack id config]
  (let [builder (MetricExpressionConfig$Builder.)]
    (when-let [data (lookup-entry config id :expression)]
      (. builder expression data))
    (when-let [data (lookup-entry config id :period)]
      (. builder period data))
    (when-let [data (lookup-entry config id :search-account)]
      (. builder searchAccount data))
    (when-let [data (lookup-entry config id :search-region)]
      (. builder searchRegion data))
    (when-let [data (lookup-entry config id :using-metrics)]
      (. builder usingMetrics data))
    (.build builder)))


(defn metric-options-builder
  "The metric-options-builder function buildes out new instances of 
MetricOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `color` | java.lang.String | [[cdk.support/lookup-entry]] | `:color` |
| `dimensionsMap` | java.util.Map | [[cdk.support/lookup-entry]] | `:dimensions-map` |
| `label` | java.lang.String | [[cdk.support/lookup-entry]] | `:label` |
| `period` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:period` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `statistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:statistic` |
| `unit` | software.amazon.awscdk.services.cloudwatch.Unit | [[cdk.api.services.cloudwatch/unit]] | `:unit` |"
  [stack id config]
  (let [builder (MetricOptions$Builder.)]
    (when-let [data (lookup-entry config id :account)]
      (. builder account data))
    (when-let [data (lookup-entry config id :color)]
      (. builder color data))
    (when-let [data (lookup-entry config id :dimensions-map)]
      (. builder dimensionsMap data))
    (when-let [data (lookup-entry config id :label)]
      (. builder label data))
    (when-let [data (lookup-entry config id :period)]
      (. builder period data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :statistic)]
      (. builder statistic data))
    (when-let [data (unit config id :unit)]
      (. builder unit data))
    (.build builder)))


(defn metric-props-builder
  "The metric-props-builder function buildes out new instances of 
MetricProps$Builder using the provided configuration.  Each field is set as follows:

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
| `unit` | software.amazon.awscdk.services.cloudwatch.Unit | [[cdk.api.services.cloudwatch/unit]] | `:unit` |"
  [stack id config]
  (let [builder (MetricProps$Builder.)]
    (when-let [data (lookup-entry config id :account)]
      (. builder account data))
    (when-let [data (lookup-entry config id :color)]
      (. builder color data))
    (when-let [data (lookup-entry config id :dimensions-map)]
      (. builder dimensionsMap data))
    (when-let [data (lookup-entry config id :label)]
      (. builder label data))
    (when-let [data (lookup-entry config id :metric-name)]
      (. builder metricName data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (when-let [data (lookup-entry config id :period)]
      (. builder period data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :statistic)]
      (. builder statistic data))
    (when-let [data (unit config id :unit)]
      (. builder unit data))
    (.build builder)))


(defn metric-stat-config-builder
  "The metric-stat-config-builder function buildes out new instances of 
MetricStatConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `dimensions` | java.util.List | [[cdk.support/lookup-entry]] | `:dimensions` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `period` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:period` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `statistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:statistic` |
| `unitFilter` | software.amazon.awscdk.services.cloudwatch.Unit | [[cdk.api.services.cloudwatch/unit]] | `:unit-filter` |"
  [stack id config]
  (let [builder (MetricStatConfig$Builder.)]
    (when-let [data (lookup-entry config id :account)]
      (. builder account data))
    (when-let [data (lookup-entry config id :dimensions)]
      (. builder dimensions data))
    (when-let [data (lookup-entry config id :metric-name)]
      (. builder metricName data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (when-let [data (lookup-entry config id :period)]
      (. builder period data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :statistic)]
      (. builder statistic data))
    (when-let [data (unit config id :unit-filter)]
      (. builder unitFilter data))
    (.build builder)))


(defn metric-widget-props-builder
  "The metric-widget-props-builder function buildes out new instances of 
MetricWidgetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |"
  [stack id config]
  (let [builder (MetricWidgetProps$Builder.)]
    (when-let [data (lookup-entry config id :height)]
      (. builder height data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :title)]
      (. builder title data))
    (when-let [data (lookup-entry config id :width)]
      (. builder width data))
    (.build builder)))


(defn search-components-builder
  "The search-components-builder function buildes out new instances of 
SearchComponents$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimensions` | java.util.List | [[cdk.support/lookup-entry]] | `:dimensions` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `populateFrom` | java.lang.String | [[cdk.support/lookup-entry]] | `:populate-from` |"
  [stack id config]
  (let [builder (SearchComponents$Builder.)]
    (when-let [data (lookup-entry config id :dimensions)]
      (. builder dimensions data))
    (when-let [data (lookup-entry config id :metric-name)]
      (. builder metricName data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (when-let [data (lookup-entry config id :populate-from)]
      (. builder populateFrom data))
    (.build builder)))


(defn single-value-widget-builder
  "The single-value-widget-builder function buildes out new instances of 
SingleValueWidget$Builder using the provided configuration.  Each field is set as follows:

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
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |"
  [stack id config]
  (let [builder (SingleValueWidget$Builder/create)]
    (when-let [data (lookup-entry config id :end)]
      (. builder end data))
    (when-let [data (lookup-entry config id :full-precision)]
      (. builder fullPrecision data))
    (when-let [data (lookup-entry config id :height)]
      (. builder height data))
    (when-let [data (lookup-entry config id :metrics)]
      (. builder metrics data))
    (when-let [data (lookup-entry config id :period)]
      (. builder period data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :set-period-to-time-range)]
      (. builder setPeriodToTimeRange data))
    (when-let [data (lookup-entry config id :sparkline)]
      (. builder sparkline data))
    (when-let [data (lookup-entry config id :start)]
      (. builder start data))
    (when-let [data (lookup-entry config id :title)]
      (. builder title data))
    (when-let [data (lookup-entry config id :width)]
      (. builder width data))
    (.build builder)))


(defn single-value-widget-props-builder
  "The single-value-widget-props-builder function buildes out new instances of 
SingleValueWidgetProps$Builder using the provided configuration.  Each field is set as follows:

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
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |"
  [stack id config]
  (let [builder (SingleValueWidgetProps$Builder.)]
    (when-let [data (lookup-entry config id :end)]
      (. builder end data))
    (when-let [data (lookup-entry config id :full-precision)]
      (. builder fullPrecision data))
    (when-let [data (lookup-entry config id :height)]
      (. builder height data))
    (when-let [data (lookup-entry config id :metrics)]
      (. builder metrics data))
    (when-let [data (lookup-entry config id :period)]
      (. builder period data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :set-period-to-time-range)]
      (. builder setPeriodToTimeRange data))
    (when-let [data (lookup-entry config id :sparkline)]
      (. builder sparkline data))
    (when-let [data (lookup-entry config id :start)]
      (. builder start data))
    (when-let [data (lookup-entry config id :title)]
      (. builder title data))
    (when-let [data (lookup-entry config id :width)]
      (. builder width data))
    (.build builder)))


(defn spacer-builder
  "The spacer-builder function buildes out new instances of 
Spacer$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |"
  [stack id config]
  (let [builder (Spacer$Builder/create)]
    (when-let [data (lookup-entry config id :height)]
      (. builder height data))
    (when-let [data (lookup-entry config id :width)]
      (. builder width data))
    (.build builder)))


(defn spacer-props-builder
  "The spacer-props-builder function buildes out new instances of 
SpacerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |"
  [stack id config]
  (let [builder (SpacerProps$Builder.)]
    (when-let [data (lookup-entry config id :height)]
      (. builder height data))
    (when-let [data (lookup-entry config id :width)]
      (. builder width data))
    (.build builder)))


(defn table-summary-props-builder
  "The table-summary-props-builder function buildes out new instances of 
TableSummaryProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `columns` | java.util.List | [[cdk.support/lookup-entry]] | `:columns` |
| `hideNonSummaryColumns` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:hide-non-summary-columns` |
| `sticky` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:sticky` |"
  [stack id config]
  (let [builder (TableSummaryProps$Builder.)]
    (when-let [data (lookup-entry config id :columns)]
      (. builder columns data))
    (when-let [data (lookup-entry config id :hide-non-summary-columns)]
      (. builder hideNonSummaryColumns data))
    (when-let [data (lookup-entry config id :sticky)]
      (. builder sticky data))
    (.build builder)))


(defn table-widget-builder
  "The table-widget-builder function buildes out new instances of 
TableWidget$Builder using the provided configuration.  Each field is set as follows:

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
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |"
  [stack id config]
  (let [builder (TableWidget$Builder/create)]
    (when-let [data (lookup-entry config id :end)]
      (. builder end data))
    (when-let [data (lookup-entry config id :full-precision)]
      (. builder fullPrecision data))
    (when-let [data (lookup-entry config id :height)]
      (. builder height data))
    (when-let [data (table-layout config id :layout)]
      (. builder layout data))
    (when-let [data (lookup-entry config id :live-data)]
      (. builder liveData data))
    (when-let [data (lookup-entry config id :metrics)]
      (. builder metrics data))
    (when-let [data (lookup-entry config id :period)]
      (. builder period data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :set-period-to-time-range)]
      (. builder setPeriodToTimeRange data))
    (when-let [data (lookup-entry config id :show-units-in-label)]
      (. builder showUnitsInLabel data))
    (when-let [data (lookup-entry config id :start)]
      (. builder start data))
    (when-let [data (lookup-entry config id :statistic)]
      (. builder statistic data))
    (when-let [data (lookup-entry config id :summary)]
      (. builder summary data))
    (when-let [data (lookup-entry config id :thresholds)]
      (. builder thresholds data))
    (when-let [data (lookup-entry config id :title)]
      (. builder title data))
    (when-let [data (lookup-entry config id :width)]
      (. builder width data))
    (.build builder)))


(defn table-widget-props-builder
  "The table-widget-props-builder function buildes out new instances of 
TableWidgetProps$Builder using the provided configuration.  Each field is set as follows:

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
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |"
  [stack id config]
  (let [builder (TableWidgetProps$Builder.)]
    (when-let [data (lookup-entry config id :end)]
      (. builder end data))
    (when-let [data (lookup-entry config id :full-precision)]
      (. builder fullPrecision data))
    (when-let [data (lookup-entry config id :height)]
      (. builder height data))
    (when-let [data (table-layout config id :layout)]
      (. builder layout data))
    (when-let [data (lookup-entry config id :live-data)]
      (. builder liveData data))
    (when-let [data (lookup-entry config id :metrics)]
      (. builder metrics data))
    (when-let [data (lookup-entry config id :period)]
      (. builder period data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :set-period-to-time-range)]
      (. builder setPeriodToTimeRange data))
    (when-let [data (lookup-entry config id :show-units-in-label)]
      (. builder showUnitsInLabel data))
    (when-let [data (lookup-entry config id :start)]
      (. builder start data))
    (when-let [data (lookup-entry config id :statistic)]
      (. builder statistic data))
    (when-let [data (lookup-entry config id :summary)]
      (. builder summary data))
    (when-let [data (lookup-entry config id :thresholds)]
      (. builder thresholds data))
    (when-let [data (lookup-entry config id :title)]
      (. builder title data))
    (when-let [data (lookup-entry config id :width)]
      (. builder width data))
    (.build builder)))


(defn text-widget-builder
  "The text-widget-builder function buildes out new instances of 
TextWidget$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `background` | software.amazon.awscdk.services.cloudwatch.TextWidgetBackground | [[cdk.api.services.cloudwatch/text-widget-background]] | `:background` |
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `markdown` | java.lang.String | [[cdk.support/lookup-entry]] | `:markdown` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |"
  [stack id config]
  (let [builder (TextWidget$Builder/create)]
    (when-let [data (text-widget-background config id :background)]
      (. builder background data))
    (when-let [data (lookup-entry config id :height)]
      (. builder height data))
    (when-let [data (lookup-entry config id :markdown)]
      (. builder markdown data))
    (when-let [data (lookup-entry config id :width)]
      (. builder width data))
    (.build builder)))


(defn text-widget-props-builder
  "The text-widget-props-builder function buildes out new instances of 
TextWidgetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `background` | software.amazon.awscdk.services.cloudwatch.TextWidgetBackground | [[cdk.api.services.cloudwatch/text-widget-background]] | `:background` |
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `markdown` | java.lang.String | [[cdk.support/lookup-entry]] | `:markdown` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |"
  [stack id config]
  (let [builder (TextWidgetProps$Builder.)]
    (when-let [data (text-widget-background config id :background)]
      (. builder background data))
    (when-let [data (lookup-entry config id :height)]
      (. builder height data))
    (when-let [data (lookup-entry config id :markdown)]
      (. builder markdown data))
    (when-let [data (lookup-entry config id :width)]
      (. builder width data))
    (.build builder)))


(defn variable-value-builder
  "The variable-value-builder function buildes out new instances of 
VariableValue$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `label` | java.lang.String | [[cdk.support/lookup-entry]] | `:label` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (VariableValue$Builder.)]
    (when-let [data (lookup-entry config id :label)]
      (. builder label data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn vertical-annotation-builder
  "The vertical-annotation-builder function buildes out new instances of 
VerticalAnnotation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `color` | java.lang.String | [[cdk.support/lookup-entry]] | `:color` |
| `date` | java.lang.String | [[cdk.support/lookup-entry]] | `:date` |
| `fill` | software.amazon.awscdk.services.cloudwatch.VerticalShading | [[cdk.api.services.cloudwatch/vertical-shading]] | `:fill` |
| `label` | java.lang.String | [[cdk.support/lookup-entry]] | `:label` |
| `visible` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:visible` |"
  [stack id config]
  (let [builder (VerticalAnnotation$Builder.)]
    (when-let [data (lookup-entry config id :color)]
      (. builder color data))
    (when-let [data (lookup-entry config id :date)]
      (. builder date data))
    (when-let [data (vertical-shading config id :fill)]
      (. builder fill data))
    (when-let [data (lookup-entry config id :label)]
      (. builder label data))
    (when-let [data (lookup-entry config id :visible)]
      (. builder visible data))
    (.build builder)))


(defn y-axis-props-builder
  "The y-axis-props-builder function buildes out new instances of 
YAxisProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `label` | java.lang.String | [[cdk.support/lookup-entry]] | `:label` |
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |
| `showUnits` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:show-units` |"
  [stack id config]
  (let [builder (YAxisProps$Builder.)]
    (when-let [data (lookup-entry config id :label)]
      (. builder label data))
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (when-let [data (lookup-entry config id :show-units)]
      (. builder showUnits data))
    (.build builder)))