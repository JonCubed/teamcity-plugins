/**
 * Copyright 2014 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.arcbees.vcs.bitbucket.model;

import com.arcbees.vcs.model.Branch;
import com.arcbees.vcs.model.Commit;
import com.arcbees.vcs.model.PullRequestTarget;

public class BitbucketPullRequestTarget implements PullRequestTarget<BitbucketCommit, BitbucketBranch> {
    private BitbucketCommit commit;
    private BitbucketBranch branch;

    @Override
    public Commit getCommit() {
        return commit;
    }

    @Override
    public void setCommit(BitbucketCommit commit) {
        this.commit = commit;
    }

    @Override
    public Branch getBranch() {
        return branch;
    }

    @Override
    public void setBranch(BitbucketBranch branch) {
        this.branch = branch;
    }
}
