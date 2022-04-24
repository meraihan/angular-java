import { Level } from "./Level";
import { SubLevel } from "./SubLevel";
import { SubSubLevel } from "./SubSubLevel";

export class Sector {
    id!: number;
    sectorName!: string;
    level!: any;
    subLevel!: any;
    subSubLevel!: any;
    isCheckedTerms!: boolean;
}