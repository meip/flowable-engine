/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.flowable.cmmn.model;

/**
 * @author Joram Barrez
 */
public class VariableAggregationDefinition {

    protected String elementId; // The id of the element where the aggregation will happen. This can be a parent element (e.g. repeating stage)
    protected String targetArrayVariable;
    protected String targetArrayVariableExpression;
    protected String source;
    protected String sourceExpression;
    protected String target;
    protected String targetExpression;

    public String getElementId() {
        return elementId;
    }

    public void setElementId(String elementId) {
        this.elementId = elementId;
    }

    public String getTargetArrayVariable() {
        return targetArrayVariable;
    }

    public void setTargetArrayVariable(String targetArrayVariable) {
        this.targetArrayVariable = targetArrayVariable;
    }

    public String getTargetArrayVariableExpression() {
        return targetArrayVariableExpression;
    }

    public void setTargetArrayVariableExpression(String targetArrayVariableExpression) {
        this.targetArrayVariableExpression = targetArrayVariableExpression;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSourceExpression() {
        return sourceExpression;
    }

    public void setSourceExpression(String sourceExpression) {
        this.sourceExpression = sourceExpression;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getTargetExpression() {
        return targetExpression;
    }

    public void setTargetExpression(String targetExpression) {
        this.targetExpression = targetExpression;
    }

}